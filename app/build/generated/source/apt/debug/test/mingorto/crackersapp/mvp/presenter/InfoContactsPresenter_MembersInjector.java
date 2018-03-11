package test.mingorto.crackersapp.mvp.presenter;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.api.UsersApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InfoContactsPresenter_MembersInjector
    implements MembersInjector<InfoContactsPresenter> {
  private final Provider<NetworkManager> mNetworkManagerProvider;

  private final Provider<GroupsApi> mGroupApiProvider;

  private final Provider<UsersApi> mUserApiProvider;

  public InfoContactsPresenter_MembersInjector(
      Provider<NetworkManager> mNetworkManagerProvider,
      Provider<GroupsApi> mGroupApiProvider,
      Provider<UsersApi> mUserApiProvider) {
    assert mNetworkManagerProvider != null;
    this.mNetworkManagerProvider = mNetworkManagerProvider;
    assert mGroupApiProvider != null;
    this.mGroupApiProvider = mGroupApiProvider;
    assert mUserApiProvider != null;
    this.mUserApiProvider = mUserApiProvider;
  }

  public static MembersInjector<InfoContactsPresenter> create(
      Provider<NetworkManager> mNetworkManagerProvider,
      Provider<GroupsApi> mGroupApiProvider,
      Provider<UsersApi> mUserApiProvider) {
    return new InfoContactsPresenter_MembersInjector(
        mNetworkManagerProvider, mGroupApiProvider, mUserApiProvider);
  }

  @Override
  public void injectMembers(InfoContactsPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseFeedPresenter) instance).mNetworkManager = mNetworkManagerProvider.get();
    instance.mGroupApi = mGroupApiProvider.get();
    instance.mUserApi = mUserApiProvider.get();
  }

  public static void injectMGroupApi(
      InfoContactsPresenter instance, Provider<GroupsApi> mGroupApiProvider) {
    instance.mGroupApi = mGroupApiProvider.get();
  }

  public static void injectMUserApi(
      InfoContactsPresenter instance, Provider<UsersApi> mUserApiProvider) {
    instance.mUserApi = mUserApiProvider.get();
  }
}
