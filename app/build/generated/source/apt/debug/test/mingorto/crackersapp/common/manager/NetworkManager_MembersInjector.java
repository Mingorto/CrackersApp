package test.mingorto.crackersapp.common.manager;

import android.content.Context;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkManager_MembersInjector implements MembersInjector<NetworkManager> {
  private final Provider<Context> mContextProvider;

  public NetworkManager_MembersInjector(Provider<Context> mContextProvider) {
    assert mContextProvider != null;
    this.mContextProvider = mContextProvider;
  }

  public static MembersInjector<NetworkManager> create(Provider<Context> mContextProvider) {
    return new NetworkManager_MembersInjector(mContextProvider);
  }

  @Override
  public void injectMembers(NetworkManager instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mContext = mContextProvider.get();
  }

  public static void injectMContext(NetworkManager instance, Provider<Context> mContextProvider) {
    instance.mContext = mContextProvider.get();
  }
}
