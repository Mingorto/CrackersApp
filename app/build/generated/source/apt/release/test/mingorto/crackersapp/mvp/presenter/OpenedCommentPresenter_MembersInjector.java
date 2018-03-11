package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenedCommentPresenter_MembersInjector
    implements MembersInjector<OpenedCommentPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  public OpenedCommentPresenter_MembersInjector(Provider<NetworkManager> mNetworkManagerProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
  }

  public static MembersInjector<OpenedCommentPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider) {
    return new OpenedCommentPresenter_MembersInjector(mNetworkManagerProvider);
  }

  @Override
  public void injectMembers(OpenedCommentPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
  }
}
