package test.mingorto.crackersapp.mvp.presenter;


import com.arellomobile.mvp.InjectViewState;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.consts.ApiConstants;
import test.mingorto.crackersapp.model.Member;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.model.view.MemberViewModel;
import test.mingorto.crackersapp.mvp.view.BaseFeedView;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.model.request.GroupsGetMembersRequestModel;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;


@InjectViewState
public class MembersPresenter extends BaseFeedPresenter<BaseFeedView>{

        @Inject
        GroupsApi mGroupsApi;

        public MembersPresenter() {
            MyApplication.getApplicationComponent().inject(this);
        }

        @Override
    public Observable<BaseViewModel> onCreateLoadDataObservable(int count, int offset) {
        return mGroupsApi.getMembers(new GroupsGetMembersRequestModel(
                ApiConstants.MY_GROUP_ID, count, offset).toMap())
            .flatMap(baseItemResponseFull -> {
                return Observable.fromIterable(baseItemResponseFull.response.getItems());
            })
            .doOnNext(member -> saveToDb(member))
            .map(member -> new MemberViewModel(member));
    }

    @Override
    public Observable<BaseViewModel> onCreateRestoreDataObservable() {
        return Observable.fromCallable(getListFromRealmCallable())
                .flatMap(Observable::fromIterable)
                .map(member -> new MemberViewModel(member));
    }

    public Callable<List<Member>> getListFromRealmCallable() {
        return () -> {
            String[] sortFields = {Member.ID};
            Sort[] sortOrder = {Sort.ASCENDING};

            Realm realm = Realm.getDefaultInstance();
            RealmResults<Member> results = realm.where(Member.class)
                    .findAllSorted(sortFields, sortOrder);
            return realm.copyFromRealm(results);
        };
    }
}


















