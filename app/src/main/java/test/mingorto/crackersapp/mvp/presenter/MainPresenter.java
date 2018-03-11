package test.mingorto.crackersapp.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.concurrent.Callable;

import javax.inject.Inject;

import test.mingorto.crackersapp.CurrentUser;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.model.Profile;
import test.mingorto.crackersapp.mvp.view.MainView;
import test.mingorto.crackersapp.rest.api.UsersApi;
import test.mingorto.crackersapp.rest.model.request.UsersGetRequestModel;
import test.mingorto.crackersapp.ui.activity.SettingActivity;
import test.mingorto.crackersapp.ui.fragment.BaseFragment;
import test.mingorto.crackersapp.ui.fragment.BoardFragment;
import test.mingorto.crackersapp.ui.fragment.GroupRulesFragment;
import test.mingorto.crackersapp.ui.fragment.InfoFragment;
import test.mingorto.crackersapp.ui.fragment.MembersFragment;
import test.mingorto.crackersapp.ui.fragment.MyPostsFragment;
import test.mingorto.crackersapp.ui.fragment.NewsFeedFragment;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.realm.Realm;
import io.realm.RealmObject;


@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    @Inject
    MyFragmentManager myFragmentManager;

    @Inject
    UsersApi mUserApi;

    @Inject
    NetworkManager mNetworkManager;

    public void checkAuth() {
        if (!CurrentUser.isAuthorized()) {
            getViewState().startSignIn();
        } else {
            getCurrentUser();
            getViewState().signedIn();
        }
    }

    public MainPresenter() {
        MyApplication.getApplicationComponent().inject(this);
    }

    public Observable<Profile> getProfileFromNetwork() {
        return mUserApi.get(new UsersGetRequestModel(CurrentUser.getId()).toMap())
                .flatMap(listFull -> Observable.fromIterable(listFull.response))
                .doOnNext(this::saveToDb);
    }

    private Observable<Profile> getProfileFromDb() {
        return Observable.fromCallable(getListFromRealmCallable());
    }

    public void saveToDb(RealmObject item) {
        Realm realm = Realm.getDefaultInstance();
        realm.executeTransaction(realm1 -> realm1.copyToRealmOrUpdate(item));
    }

    public Callable<Profile> getListFromRealmCallable() {
        return () -> {
            Realm realm = Realm.getDefaultInstance();
            Profile realmResults = realm.where(Profile.class)
                    .equalTo("id", Integer.parseInt(CurrentUser.getId()))
                    .findFirst();
            return realm.copyFromRealm(realmResults);
        };
    }

    private void getCurrentUser() {
        mNetworkManager.getNetworkObservable()
                .flatMap(aBoolean ->  {
                    if (!CurrentUser.isAuthorized()) {
                        getViewState().startSignIn();
                    }
                    return aBoolean
                            ? getProfileFromNetwork()
                            : getProfileFromDb();
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(profile -> {
                    getViewState().showCurrentUser(profile);
                }, error -> {
                    error.printStackTrace();
                });
    }

    public void drawerItemClick(int id){
        BaseFragment fragment = null;

        switch (id) {
            case 1:
                fragment = new NewsFeedFragment();
                break;
            case 2:
                fragment = new MyPostsFragment();
                break;
            case 3:
                getViewState().startActivityFromDrawer(SettingActivity.class);
                return;
            case 4:
                fragment = new MembersFragment();
                break;
            case 5:
                fragment = new BoardFragment();
                break;
            case 6:
                fragment = new InfoFragment();
                break;
            case 7:
                fragment = new GroupRulesFragment();
                break;
        }

        if (fragment != null && !myFragmentManager.isAlreadyContains(fragment)) {
            getViewState().showFragmentFromDrawer(fragment);
        }
    }

}
























