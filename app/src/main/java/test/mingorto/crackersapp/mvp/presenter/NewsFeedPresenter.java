package test.mingorto.crackersapp.mvp.presenter;

import com.arellomobile.mvp.InjectViewState;
import test.mingorto.crackersapp.CurrentUser;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.common.utils.VkListHelper;
import test.mingorto.crackersapp.consts.ApiConstants;
import test.mingorto.crackersapp.model.WallItem;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.model.view.NewsItemBodyViewModel;
import test.mingorto.crackersapp.model.view.NewsItemFooterViewModel;
import test.mingorto.crackersapp.model.view.NewsItemHeaderViewModel;
import test.mingorto.crackersapp.mvp.view.BaseFeedView;
import test.mingorto.crackersapp.rest.api.WallApi;
import test.mingorto.crackersapp.rest.model.request.WallGetRequestModel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.realm.Realm;
import io.realm.RealmResults;
import io.realm.Sort;

@InjectViewState

public class NewsFeedPresenter extends BaseFeedPresenter<BaseFeedView>{

    private boolean enableIdFiltering = false;

    @Inject
    WallApi mWallApi;

    public NewsFeedPresenter() {
        MyApplication.getApplicationComponent().inject(this);
    }

    @Override
    public Observable<BaseViewModel> onCreateLoadDataObservable(int count, int offset) {
        return mWallApi.get(new WallGetRequestModel(ApiConstants.MY_GROUP_ID, count, offset).toMap())
                .flatMap(full -> Observable.fromIterable(VkListHelper.getWallList(full.response)))
                .compose(applyFilter())
                .doOnNext(this::saveToDb)
                .flatMap(wallItem -> Observable.fromIterable(parsePojoModel(wallItem)));
    }



    public void setEnableIdFiltering(boolean enableIdFiltering) {
        this.enableIdFiltering = enableIdFiltering;
    }

    protected ObservableTransformer<WallItem, WallItem> applyFilter() {
        if (enableIdFiltering && CurrentUser.getId() != null) {
            return baseItemObservable -> baseItemObservable.filter(
                    wallItem -> CurrentUser.getId().equals(String.valueOf(wallItem.getFromId()))
            );
        } else {
            return baseItemObservable -> baseItemObservable;
        }
    }

    public Callable<List<WallItem>> getListFromRealmCallable() {
        return () -> {
            String[] sortFields = {"date"};
            Sort[] sortOrder = {Sort.DESCENDING};
            Realm realm = Realm.getDefaultInstance();
            RealmResults<WallItem> realmResults = realm.where(WallItem.class)
                    .findAllSorted(sortFields, sortOrder);
            return realm.copyFromRealm(realmResults);
        };
    }

    @Override
    public Observable<BaseViewModel> onCreateRestoreDataObservable() {
        return Observable.fromCallable(getListFromRealmCallable())
                .flatMap(Observable::fromIterable)
                .compose(applyFilter())
                .flatMap(wallItem -> Observable.fromIterable(parsePojoModel(wallItem)));
    }

    private List<BaseViewModel> parsePojoModel(WallItem wallItem) {
        List<BaseViewModel> baseItems = new ArrayList<>();
        baseItems.add(new NewsItemHeaderViewModel(wallItem));
        baseItems.add(new NewsItemBodyViewModel(wallItem));
        baseItems.add(new NewsItemFooterViewModel(wallItem));

        return baseItems;
    }
}





















