package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.mvp.view.BaseFeedView;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseFeedPresenter_MembersInjector<V extends BaseFeedView>
    implements MembersInjector<BaseFeedPresenter<V>> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  public BaseFeedPresenter_MembersInjector(Provider<NetworkManager> mNetworkManagerProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
  }

  public static <V extends BaseFeedView> MembersInjector<BaseFeedPresenter<V>> create(
      Provider<NetworkManager> mNetworkManagerProvider) {
    return new BaseFeedPresenter_MembersInjector<V>(mNetworkManagerProvider);
  }

  @Override
  public void injectMembers(BaseFeedPresenter<V> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mNetworkManager = mNetworkManagerProvider.get();
  }

  public static <V extends BaseFeedView> void injectMNetworkManager(
      BaseFeedPresenter<V> instance, Provider<NetworkManager> mNetworkManagerProvider) {
    instance.mNetworkManager = mNetworkManagerProvider.get();
  }
}
