package test.mingorto.crackersapp.ui.view.holder;

import android.graphics.Typeface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.rest.api.WallApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsItemFooterHolder_MembersInjector
    implements MembersInjector<NewsItemFooterHolder> {
  private final Provider<WallApi> mWallApiProvider;

  private final Provider<Typeface> mGoogleFontTypefaceProvider;

  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public NewsItemFooterHolder_MembersInjector(
      Provider<WallApi> mWallApiProvider,
      Provider<Typeface> mGoogleFontTypefaceProvider,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mWallApiProvider != null;
    this.mWallApiProvider = mWallApiProvider;
    assert mGoogleFontTypefaceProvider != null;
    this.mGoogleFontTypefaceProvider = mGoogleFontTypefaceProvider;
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<NewsItemFooterHolder> create(
      Provider<WallApi> mWallApiProvider,
      Provider<Typeface> mGoogleFontTypefaceProvider,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new NewsItemFooterHolder_MembersInjector(
        mWallApiProvider, mGoogleFontTypefaceProvider, mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(NewsItemFooterHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mWallApi = mWallApiProvider.get();
    instance.mGoogleFontTypeface = mGoogleFontTypefaceProvider.get();
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMWallApi(
      NewsItemFooterHolder instance, Provider<WallApi> mWallApiProvider) {
    instance.mWallApi = mWallApiProvider.get();
  }

  public static void injectMGoogleFontTypeface(
      NewsItemFooterHolder instance, Provider<Typeface> mGoogleFontTypefaceProvider) {
    instance.mGoogleFontTypeface = mGoogleFontTypefaceProvider.get();
  }

  public static void injectMFragmentManager(
      NewsItemFooterHolder instance, Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
