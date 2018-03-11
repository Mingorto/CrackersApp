package test.mingorto.crackersapp.ui.view.holder;

import android.graphics.Typeface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NewsItemBodyHolder_MembersInjector
    implements MembersInjector<NewsItemBodyHolder> {
  private final Provider<Typeface> mFontGoogleProvider;

  private final Provider<MyFragmentManager> myFragmentManagerProvider;

  public NewsItemBodyHolder_MembersInjector(
      Provider<Typeface> mFontGoogleProvider,
      Provider<MyFragmentManager> myFragmentManagerProvider) {
    assert mFontGoogleProvider != null;
    this.mFontGoogleProvider = mFontGoogleProvider;
    assert myFragmentManagerProvider != null;
    this.myFragmentManagerProvider = myFragmentManagerProvider;
  }

  public static MembersInjector<NewsItemBodyHolder> create(
      Provider<Typeface> mFontGoogleProvider,
      Provider<MyFragmentManager> myFragmentManagerProvider) {
    return new NewsItemBodyHolder_MembersInjector(mFontGoogleProvider, myFragmentManagerProvider);
  }

  @Override
  public void injectMembers(NewsItemBodyHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFontGoogle = mFontGoogleProvider.get();
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }

  public static void injectMFontGoogle(
      NewsItemBodyHolder instance, Provider<Typeface> mFontGoogleProvider) {
    instance.mFontGoogle = mFontGoogleProvider.get();
  }

  public static void injectMyFragmentManager(
      NewsItemBodyHolder instance, Provider<MyFragmentManager> myFragmentManagerProvider) {
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }
}
