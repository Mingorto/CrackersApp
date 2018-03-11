package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.rest.api.BoardApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopicCommentsPresenter_MembersInjector
    implements MembersInjector<TopicCommentsPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<BoardApi> mBoardApiProvider;

  public TopicCommentsPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<BoardApi> mBoardApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mBoardApiProvider != null;
    this.mBoardApiProvider = mBoardApiProvider;
  }

  public static MembersInjector<TopicCommentsPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<BoardApi> mBoardApiProvider) {
    return new TopicCommentsPresenter_MembersInjector(mNetworkManagerProvider, mBoardApiProvider);
  }

  @Override
  public void injectMembers(TopicCommentsPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mBoardApi = mBoardApiProvider.get();
  }

  public static void injectMBoardApi(
      TopicCommentsPresenter instance, Provider<BoardApi> mBoardApiProvider) {
    instance.mBoardApi = mBoardApiProvider.get();
  }
}
