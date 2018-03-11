package test.mingorto.crackersapp.mvp.presenter;


import com.arellomobile.mvp.InjectViewState;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.consts.ApiConstants;
import test.mingorto.crackersapp.model.Group;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.model.view.InfoContactsViewModel;
import test.mingorto.crackersapp.model.view.InfoLinksViewModel;
import test.mingorto.crackersapp.model.view.InfoStatusViewModel;
import test.mingorto.crackersapp.mvp.view.BaseFeedView;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.model.request.GroupsGetByIdRequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.realm.Realm;

@InjectViewState
public class InfoPresenter extends BaseFeedPresenter<BaseFeedView>{

    @Inject
    GroupsApi mGroupApi;

    public InfoPresenter() {
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    public Observable<BaseViewModel> onCreateLoadDataObservable(int count, int offset) {
        return mGroupApi.getById(new GroupsGetByIdRequestModel(ApiConstants.MY_GROUP_ID).toMap())
                .flatMap(listFull -> Observable.fromIterable(listFull.response))
                .doOnNext(this::saveToDb)
                .flatMap(group -> Observable.fromIterable(parsePojoModel(group)));
    }

    @Override
    public Observable<BaseViewModel> onCreateRestoreDataObservable() {
        return Observable.fromCallable(getListFromRealmCallable())
                .flatMap(group -> Observable.fromIterable(parsePojoModel(group)));
    }

    private List<BaseViewModel> parsePojoModel(Group group) {
        List<BaseViewModel> items = new ArrayList<>();
        items.add(new InfoStatusViewModel(group));
        items.add(new InfoContactsViewModel());
        items.add(new InfoLinksViewModel());

        return items;
    }

    public Callable<Group> getListFromRealmCallable() {
        return () -> {
            Realm realm = Realm.getDefaultInstance();
            Group result = realm.where(Group.class)
                    .equalTo("id", Math.abs(ApiConstants.MY_GROUP_ID))
                    .findFirst();
            return realm.copyFromRealm(result);
        };
    }
}



















