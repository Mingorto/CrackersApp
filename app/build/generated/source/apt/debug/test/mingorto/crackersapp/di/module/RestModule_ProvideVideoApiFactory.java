package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.VideoApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideVideoApiFactory implements Factory<VideoApi> {
  private final RestModule module;

  public RestModule_ProvideVideoApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public VideoApi get() {
    return Preconditions.checkNotNull(
        module.provideVideoApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<VideoApi> create(RestModule module) {
    return new RestModule_ProvideVideoApiFactory(module);
  }
}
