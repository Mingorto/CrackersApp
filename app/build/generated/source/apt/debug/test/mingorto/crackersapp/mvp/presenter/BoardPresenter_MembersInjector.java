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
public final class BoardPresenter_MembersInjector implements MembersInjector<BoardPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<BoardApi> mBoardApiProvider;

  public BoardPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<BoardApi> mBoardApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mBoardApiProvider != null;
    this.mBoardApiProvider = mBoardApiProvider;
  }

  public static MembersInjector<BoardPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<BoardApi> mBoardApiProvider) {
    return new BoardPresenter_MembersInjector(mNetworkManagerProvider, mBoardApiProvider);
  }

  @Override
  public void injectMembers(BoardPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mBoardApi = mBoardApiProvider.get();
  }

  public static void injectMBoardApi(
      BoardPresenter instance, Provider<BoardApi> mBoardApiProvider) {
    instance.mBoardApi = mBoardApiProvider.get();
  }
}
