package test.mingorto.crackersapp.di.module;

import android.content.Context;
import android.graphics.Typeface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideGoogleFontTypefaceFactory implements Factory<Typeface> {
  private final ApplicationModule module;

  private final Provider<Context> contextProvider;

  public ApplicationModule_ProvideGoogleFontTypefaceFactory(
      ApplicationModule module, Provider<Context> contextProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
  }

  @Override
  public Typeface get() {
    return Preconditions.checkNotNull(
        module.provideGoogleFontTypeface(contextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Typeface> create(
      ApplicationModule module, Provider<Context> contextProvider) {
    return new ApplicationModule_ProvideGoogleFontTypefaceFactory(module, contextProvider);
  }

  /** Proxies {@link ApplicationModule#provideGoogleFontTypeface(Context)}. */
  public static Typeface proxyProvideGoogleFontTypeface(
      ApplicationModule instance, Context context) {
    return instance.provideGoogleFontTypeface(context);
  }
}
