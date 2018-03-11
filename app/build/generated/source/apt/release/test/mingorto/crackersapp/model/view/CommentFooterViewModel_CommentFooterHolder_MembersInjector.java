package test.mingorto.crackersapp.model.view;

import android.graphics.Typeface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommentFooterViewModel_CommentFooterHolder_MembersInjector
    implements MembersInjector<CommentFooterViewModel.CommentFooterHolder> {
  private final Provider<Typeface> mGoogleFontTypefaceProvider;

  public CommentFooterViewModel_CommentFooterHolder_MembersInjector(
      Provider<Typeface> mGoogleFontTypefaceProvider) {
    assert mGoogleFontTypefaceProvider != null;
    this.mGoogleFontTypefaceProvider = mGoogleFontTypefaceProvider;
  }

  public static MembersInjector<CommentFooterViewModel.CommentFooterHolder> create(
      Provider<Typeface> mGoogleFontTypefaceProvider) {
    return new CommentFooterViewModel_CommentFooterHolder_MembersInjector(
        mGoogleFontTypefaceProvider);
  }

  @Override
  public void injectMembers(CommentFooterViewModel.CommentFooterHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGoogleFontTypeface = mGoogleFontTypefaceProvider.get();
  }

  public static void injectMGoogleFontTypeface(
      CommentFooterViewModel.CommentFooterHolder instance,
      Provider<Typeface> mGoogleFontTypefaceProvider) {
    instance.mGoogleFontTypeface = mGoogleFontTypefaceProvider.get();
  }
}
