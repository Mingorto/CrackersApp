package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.rest.api.GroupsApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InfoPresenter_MembersInjector implements MembersInjector<InfoPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<GroupsApi> mGroupApiProvider;

  public InfoPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<GroupsApi> mGroupApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mGroupApiProvider != null;
    this.mGroupApiProvider = mGroupApiProvider;
  }

  public static MembersInjector<InfoPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<GroupsApi> mGroupApiProvider) {
    return new InfoPresenter_MembersInjector(mNetworkManagerProvider, mGroupApiProvider);
  }

  @Override
  public void injectMembers(InfoPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mGroupApi = mGroupApiProvider.get();
  }

  public static void injectMGroupApi(
      InfoPresenter instance, Provider<GroupsApi> mGroupApiProvider) {
    instance.mGroupApi = mGroupApiProvider.get();
  }
}
