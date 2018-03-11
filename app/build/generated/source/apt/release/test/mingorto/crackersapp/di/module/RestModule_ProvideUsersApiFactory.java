package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.UsersApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideUsersApiFactory implements Factory<UsersApi> {
  private final RestModule module;

  public RestModule_ProvideUsersApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UsersApi get() {
    return Preconditions.checkNotNull(
        module.provideUsersApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UsersApi> create(RestModule module) {
    return new RestModule_ProvideUsersApiFactory(module);
  }
}
