package test.mingorto.crackersapp.model.view;

import android.graphics.Typeface;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CommentBodyViewModel_CommentBodyViewHolder_MembersInjector
    implements MembersInjector<CommentBodyViewModel.CommentBodyViewHolder> {
  private final Provider<Typeface> mGoogleFontProvider;

  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public CommentBodyViewModel_CommentBodyViewHolder_MembersInjector(
      Provider<Typeface> mGoogleFontProvider,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mGoogleFontProvider != null;
    this.mGoogleFontProvider = mGoogleFontProvider;
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<CommentBodyViewModel.CommentBodyViewHolder> create(
      Provider<Typeface> mGoogleFontProvider,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new CommentBodyViewModel_CommentBodyViewHolder_MembersInjector(
        mGoogleFontProvider, mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(CommentBodyViewModel.CommentBodyViewHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mGoogleFont = mGoogleFontProvider.get();
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMGoogleFont(
      CommentBodyViewModel.CommentBodyViewHolder instance, Provider<Typeface> mGoogleFontProvider) {
    instance.mGoogleFont = mGoogleFontProvider.get();
  }

  public static void injectMFragmentManager(
      CommentBodyViewModel.CommentBodyViewHolder instance,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
