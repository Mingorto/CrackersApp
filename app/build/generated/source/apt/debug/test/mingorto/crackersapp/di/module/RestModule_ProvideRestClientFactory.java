package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.RestClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideRestClientFactory implements Factory<RestClient> {
  private final RestModule module;

  public RestModule_ProvideRestClientFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RestClient get() {
    return Preconditions.checkNotNull(
        module.provideRestClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RestClient> create(RestModule module) {
    return new RestModule_ProvideRestClientFactory(module);
  }
}
