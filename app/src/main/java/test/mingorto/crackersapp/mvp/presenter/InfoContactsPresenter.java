package test.mingorto.crackersapp.mvp.presenter;


import com.arellomobile.mvp.InjectViewState;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.consts.ApiConstants;
import test.mingorto.crackersapp.model.Profile;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.model.view.MemberViewModel;
import test.mingorto.crackersapp.mvp.view.BaseFeedView;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.api.UsersApi;
import test.mingorto.crackersapp.rest.model.request.GroupsGetByIdRequestModel;
import test.mingorto.crackersapp.rest.model.request.UsersGetRequestModel;
import io.reactivex.Observable;
import io.realm.Realm;

@InjectViewState
public class InfoContactsPresenter extends BaseFeedPresenter<BaseFeedView>{

    @Inject
    GroupsApi mGroupApi;

    @Inject
    UsersApi mUserApi;

    public InfoContactsPresenter() {
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    public Observable<BaseViewModel> onCreateLoadDataObservable(int count, int offset) {
        return mGroupApi.getById(new GroupsGetByIdRequestModel(ApiConstants.MY_GROUP_ID).toMap())
                .flatMap(listFull -> Observable.fromIterable(listFull.response))
                .flatMap(group-> Observable.fromIterable(group.getContactList()))
                .flatMap(contact -> mUserApi.get(new UsersGetRequestModel(String.valueOf(contact.getUserId())).toMap()))
                .flatMap(listFull -> Observable.fromIterable(listFull.response))
                .doOnNext(profile -> profile.setContact(true))
                .doOnNext(this::saveToDb)
                .flatMap(profile -> Observable.fromIterable(parsePojoModel(profile)));
    }

    @Override
    public Observable<BaseViewModel> onCreateRestoreDataObservable() {
        return Observable.fromCallable(getListFromRealmCallable())
                .flatMap(profile -> Observable.fromIterable(parsePojoModel(profile)));

    }

    private List<BaseViewModel> parsePojoModel(Profile profile) {
        List<BaseViewModel> items = new ArrayList<>();
        items.add(new MemberViewModel(profile));

        return items;
    }

    private List<BaseViewModel> parsePojoModel(List<Profile> profileList) {
        List<BaseViewModel> items = new ArrayList<>();
        for (Profile profile : profileList) {
            items.addAll(parsePojoModel(profile));
        }

        return items;
    }

    public Callable<List<Profile>> getListFromRealmCallable() {
        return () -> {
            Realm realm = Realm.getDefaultInstance();
            List<Profile> result = realm.where(Profile.class)
                    .equalTo("isContact", true)
                    .findAll();
            return realm.copyFromRealm(result);
        };
    }
}



















