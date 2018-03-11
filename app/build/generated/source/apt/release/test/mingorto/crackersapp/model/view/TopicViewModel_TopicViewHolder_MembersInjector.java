package test.mingorto.crackersapp.model.view;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopicViewModel_TopicViewHolder_MembersInjector
    implements MembersInjector<TopicViewModel.TopicViewHolder> {
  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public TopicViewModel_TopicViewHolder_MembersInjector(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<TopicViewModel.TopicViewHolder> create(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new TopicViewModel_TopicViewHolder_MembersInjector(mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(TopicViewModel.TopicViewHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMFragmentManager(
      TopicViewModel.TopicViewHolder instance,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
