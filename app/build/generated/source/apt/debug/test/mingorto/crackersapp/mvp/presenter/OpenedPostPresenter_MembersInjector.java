package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.rest.api.WallApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenedPostPresenter_MembersInjector
    implements MembersInjector<OpenedPostPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<WallApi> mWallApiProvider;

  public OpenedPostPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<WallApi> mWallApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mWallApiProvider != null;
    this.mWallApiProvider = mWallApiProvider;
  }

  public static MembersInjector<OpenedPostPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<WallApi> mWallApiProvider) {
    return new OpenedPostPresenter_MembersInjector(mNetworkManagerProvider, mWallApiProvider);
  }

  @Override
  public void injectMembers(OpenedPostPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mWallApi = mWallApiProvider.get();
  }

  public static void injectMWallApi(
      OpenedPostPresenter instance, Provider<WallApi> mWallApiProvider) {
    instance.mWallApi = mWallApiProvider.get();
  }
}
