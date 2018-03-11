package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.BoardApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideBoardApiFactory implements Factory<BoardApi> {
  private final RestModule module;

  public RestModule_ProvideBoardApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BoardApi get() {
    return Preconditions.checkNotNull(
        module.provideBoardApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BoardApi> create(RestModule module) {
    return new RestModule_ProvideBoardApiFactory(module);
  }
}
