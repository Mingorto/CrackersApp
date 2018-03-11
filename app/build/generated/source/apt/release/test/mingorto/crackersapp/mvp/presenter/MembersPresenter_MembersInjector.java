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
public final class MembersPresenter_MembersInjector implements MembersInjector<MembersPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<GroupsApi> mGroupsApiProvider;

  public MembersPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<GroupsApi> mGroupsApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mGroupsApiProvider != null;
    this.mGroupsApiProvider = mGroupsApiProvider;
  }

  public static MembersInjector<MembersPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider, Provider<GroupsApi> mGroupsApiProvider) {
    return new MembersPresenter_MembersInjector(mNetworkManagerProvider, mGroupsApiProvider);
  }

  @Override
  public void injectMembers(MembersPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mGroupsApi = mGroupsApiProvider.get();
  }

  public static void injectMGroupsApi(
      MembersPresenter instance, Provider<GroupsApi> mGroupsApiProvider) {
    instance.mGroupsApi = mGroupsApiProvider.get();
  }
}
