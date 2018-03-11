package test.mingorto.crackersapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import test.mingorto.crackersapp.rest.api.GroupsApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RestModule_ProvideGroupsApiFactory implements Factory<GroupsApi> {
  private final RestModule module;

  public RestModule_ProvideGroupsApiFactory(RestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public GroupsApi get() {
    return Preconditions.checkNotNull(
        module.provideGroupsApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GroupsApi> create(RestModule module) {
    return new RestModule_ProvideGroupsApiFactory(module);
  }
}
