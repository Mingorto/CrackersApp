package test.mingorto.crackersapp.ui.activity;

import android.view.LayoutInflater;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.rest.api.AccountApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MyFragmentManager> myFragmentManagerProvider;

  private final Provider<LayoutInflater> mLayoutInflaterProvider;

  private final Provider<AccountApi> mAccountApiProvider;

  public MainActivity_MembersInjector(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider,
      Provider<AccountApi> mAccountApiProvider) {
    assert myFragmentManagerProvider != null;
    this.myFragmentManagerProvider = myFragmentManagerProvider;
    assert mLayoutInflaterProvider != null;
    this.mLayoutInflaterProvider = mLayoutInflaterProvider;
    assert mAccountApiProvider != null;
    this.mAccountApiProvider = mAccountApiProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider,
      Provider<AccountApi> mAccountApiProvider) {
    return new MainActivity_MembersInjector(
        myFragmentManagerProvider, mLayoutInflaterProvider, mAccountApiProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseActivity) instance).myFragmentManager = myFragmentManagerProvider.get();
    ((BaseActivity) instance).mLayoutInflater = mLayoutInflaterProvider.get();
    instance.mAccountApi = mAccountApiProvider.get();
  }

  public static void injectMAccountApi(
      MainActivity instance, Provider<AccountApi> mAccountApiProvider) {
    instance.mAccountApi = mAccountApiProvider.get();
  }
}
