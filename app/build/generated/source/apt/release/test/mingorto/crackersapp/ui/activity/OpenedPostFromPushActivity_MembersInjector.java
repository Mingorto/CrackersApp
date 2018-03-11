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
public final class OpenedPostFromPushActivity_MembersInjector
    implements MembersInjector<OpenedPostFromPushActivity> {
  private final Provider<MyFragmentManager> myFragmentManagerProvider;

  private final Provider<LayoutInflater> mLayoutInflaterProvider;

  public OpenedPostFromPushActivity_MembersInjector(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider) {
    assert myFragmentManagerProvider != null;
    this.myFragmentManagerProvider = myFragmentManagerProvider;
    assert mLayoutInflaterProvider != null;
    this.mLayoutInflaterProvider = mLayoutInflaterProvider;
  }

  public static MembersInjector<OpenedPostFromPushActivity> create(
      Provider<MyFragmentManager> myFragmentManagerProvider,
      Provider<LayoutInflater> mLayoutInflaterProvider) {
    return new OpenedPostFromPushActivity_MembersInjector(
        myFragmentManagerProvider, mLayoutInflaterProvider);
  }

  @Override
  public void injectMembers(OpenedPostFromPushActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseActivity) instance).myFragmentManager = myFragmentManagerProvider.get();
    ((BaseActivity) instance).mLayoutInflater = mLayoutInflaterProvider.get();
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }

  public static void injectMyFragmentManager(
      OpenedPostFromPushActivity instance, Provider<MyFragmentManager> myFragmentManagerProvider) {
    instance.myFragmentManager = myFragmentManagerProvider.get();
  }
}
