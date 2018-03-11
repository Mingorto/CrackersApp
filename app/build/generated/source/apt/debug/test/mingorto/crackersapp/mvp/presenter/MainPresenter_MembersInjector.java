package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.rest.api.UsersApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainPresenter_MembersInjector implements MembersInjector<MainPresenter> {
  private final Provider<MyFragmentManager> myFragmentManagerProvider;

  private final Provider<UsersApi> mUserApiProvider;

  private final Provider<NetworkManager> mNetworkManagerProvider;

  public MainPresenter_MembersInjector(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<UsersApi> mUserApiProvider,
      Provider<NetworkManager> mNetworkManagerProvider) {
    assert myFragmentManagerProvider != null;
    this.myFragmentManagerProvider = myFragmentManagerProvider;
    assert mUserApiProvider != null;
    this.mUserApiProvider = mUserApiProvider;
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
  }

  public static MembersInjector<MainPresenter> create(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<UsersApi> mUserApiProvider,
      Provider<NetworkManager> mNetworkManagerProvider) {
    return new MainPresenter_MembersInjector(
        myFragmentManagerProvider, mUserApiProvider, mNetworkManagerProvider);
  }

  @Override
  public void injectMembers(MainPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.myFragmentManager = myFragmentManagerProvider.get();
    instance.mUserApi = mUserApiProvider.get();
    instance.mNetworkManager = mNetworkManagerProvider.get();
  }

  public static void injectMyFragmentManager(
      MainPresenter instance, Provider<MyFragmentManager> myFragmentManagerProvider) {
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }

  public static void injectMUserApi(MainPresenter instance, Provider<UsersApi> mUserApiProvider) {
    instance.mUserApi = mUserApiProvider.get();
  }

  public static void injectMNetworkManager(
      MainPresenter instance, Provider<NetworkManager> mNetworkManagerProvider) {
    instance.mNetworkManager = mNetworkManagerProvider.get();
  }
}
