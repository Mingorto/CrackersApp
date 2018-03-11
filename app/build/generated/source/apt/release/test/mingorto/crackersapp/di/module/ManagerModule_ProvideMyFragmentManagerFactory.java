package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ManagerModule_ProvideMyFragmentManagerFactory
    implements Factory<MyFragmentManager> {
  private final ManagerModule module;

  public ManagerModule_ProvideMyFragmentManagerFactory(ManagerModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MyFragmentManager get() {
    return Preconditions.checkNotNull(
        module.provideMyFragmentManager(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MyFragmentManager> create(ManagerModule module) {
    return new ManagerModule_ProvideMyFragmentManagerFactory(module);
  }

  /** Proxies {@link ManagerModule#provideMyFragmentManager()}. */
  public static MyFragmentManager proxyProvideMyFragmentManager(ManagerModule instance) {
    return instance.provideMyFragmentManager();
  }
}
