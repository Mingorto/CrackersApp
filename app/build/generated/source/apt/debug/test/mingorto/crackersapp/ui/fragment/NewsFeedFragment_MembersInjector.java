package test.mingorto.crackersapp.ui.fragment;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.rest.api.WallApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsFeedFragment_MembersInjector implements MembersInjector<NewsFeedFragment> {
  private final Provider<WallApi> mWallApiProvider;

  public NewsFeedFragment_MembersInjector(Provider<WallApi> mWallApiProvider) {
    assert mWallApiProvider != null;
    this.mWallApiProvider = mWallApiProvider;
  }

  public static MembersInjector<NewsFeedFragment> create(Provider<WallApi> mWallApiProvider) {
    return new NewsFeedFragment_MembersInjector(mWallApiProvider);
  }

  @Override
  public void injectMembers(NewsFeedFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mWallApi = mWallApiProvider.get();
  }

  public static void injectMWallApi(NewsFeedFragment instance, Provider<WallApi> mWallApiProvider) {
    instance.mWallApi = mWallApiProvider.get();
  }
}
