package test.mingorto.crackersapp.mvp.view;


import com.arellomobile.mvp.MvpView;
import test.mingorto.crackersapp.model.view.BaseViewModel;

import java.util.List;

public interface BaseFeedView extends MvpView {

    void showRefreshing();

    void hideRefreshing();

    void showListProgress();

    void hideListProgress();

    void showError(String message);

    void setItems(List<BaseViewModel> items);

    void addItems(List<BaseViewModel> items);
}
