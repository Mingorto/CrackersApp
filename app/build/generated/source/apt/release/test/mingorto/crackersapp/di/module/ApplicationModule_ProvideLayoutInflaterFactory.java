package test.mingorto.crackersapp.di.module;

import android.view.LayoutInflater;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideLayoutInflaterFactory
    implements Factory<LayoutInflater> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideLayoutInflaterFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LayoutInflater get() {
    return Preconditions.checkNotNull(
        module.provideLayoutInflater(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LayoutInflater> create(ApplicationModule module) {
    return new ApplicationModule_ProvideLayoutInflaterFactory(module);
  }

  /** Proxies {@link ApplicationModule#provideLayoutInflater()}. */
  public static LayoutInflater proxyProvideLayoutInflater(ApplicationModule instance) {
    return instance.provideLayoutInflater();
  }
}
