package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.common.manager.NetworkManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ManagerModule_ProvideNetworkManagerFactory implements Factory<NetworkManager> {
  private final ManagerModule module;

  public ManagerModule_ProvideNetworkManagerFactory(ManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public NetworkManager get() {
    return Preconditions.checkNotNull(
        module.provideNetworkManager(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<NetworkManager> create(ManagerModule module) {
    return new ManagerModule_ProvideNetworkManagerFactory(module);
  }

  /** Proxies {@link ManagerModule#provideNetworkManager()}. */
  public static NetworkManager proxyProvideNetworkManager(ManagerModule instance) {
    return instance.provideNetworkManager();
  }
}
