package test.mingorto.crackersapp.ui.activity;

import android.view.LayoutInflater;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<MyFragmentManager> myFragmentManagerProvider;

  private final Provider<LayoutInflater> mLayoutInflaterProvider;

  public BaseActivity_MembersInjector(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider) {
    assert myFragmentManagerProvider != null;
    this.myFragmentManagerProvider = myFragmentManagerProvider;
    assert mLayoutInflaterProvider != null;
    this.mLayoutInflaterProvider = mLayoutInflaterProvider;
  }

  public static MembersInjector<BaseActivity> create(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider) {
    return new BaseActivity_MembersInjector(myFragmentManagerProvider, mLayoutInflaterProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.myFragmentManager = myFragmentManagerProvider.get();
    instance.mLayoutInflater = mLayoutInflaterProvider.get();
  }

  public static void injectMyFragmentManager(
      BaseActivity instance, Provider<MyFragmentManager> myFragmentManagerProvider) {
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }

  public static void injectMLayoutInflater(
      BaseActivity instance, Provider<LayoutInflater> mLayoutInflaterProvider) {
    instance.mLayoutInflater = mLayoutInflaterProvider.get();
  }
}
