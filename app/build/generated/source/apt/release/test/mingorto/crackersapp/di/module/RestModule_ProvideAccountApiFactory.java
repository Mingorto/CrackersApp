package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.AccountApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideAccountApiFactory implements Factory<AccountApi> {
  private final RestModule module;

  public RestModule_ProvideAccountApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AccountApi get() {
    return Preconditions.checkNotNull(
        module.provideAccountApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AccountApi> create(RestModule module) {
    return new RestModule_ProvideAccountApiFactory(module);
  }
}
