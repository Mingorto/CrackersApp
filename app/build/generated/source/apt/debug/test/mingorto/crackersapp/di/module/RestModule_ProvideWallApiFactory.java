package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.WallApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideWallApiFactory implements Factory<WallApi> {
  private final RestModule module;

  public RestModule_ProvideWallApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public WallApi get() {
    return Preconditions.checkNotNull(
        module.provideWallApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WallApi> create(RestModule module) {
    return new RestModule_ProvideWallApiFactory(module);
  }
}
