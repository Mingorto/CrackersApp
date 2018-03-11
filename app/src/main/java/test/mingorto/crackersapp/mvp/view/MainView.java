package test.mingorto.crackersapp.mvp.view;

import com.arellomobile.mvp.MvpView;
import test.mingorto.crackersapp.model.Profile;
import test.mingorto.crackersapp.ui.fragment.BaseFragment;


public interface MainView extends MvpView {
    void startSignIn();
    void signedIn();
    void showCurrentUser(Profile profile);
    void showFragmentFromDrawer(BaseFragment baseFragment);
    void startActivityFromDrawer(Class<?> act);
}
