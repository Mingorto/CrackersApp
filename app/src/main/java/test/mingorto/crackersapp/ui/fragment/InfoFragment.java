package test.mingorto.crackersapp.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.ButterKnife;
import test.mingorto.crackersapp.R;
import test.mingorto.crackersapp.mvp.presenter.BaseFeedPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoPresenter;

public class InfoFragment extends  BaseFeedFragment {

    @InjectPresenter
    InfoPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setWithEndlessList(false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    protected BaseFeedPresenter onCreateFeedPresenter() {
        return mPresenter;
    }

    @Override
    public int onCreateToolbarTitle() {
        return R.string.screen_name_info;
    }
}
