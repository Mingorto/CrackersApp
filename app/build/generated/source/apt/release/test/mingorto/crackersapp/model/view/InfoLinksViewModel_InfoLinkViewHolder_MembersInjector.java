package test.mingorto.crackersapp.model.view;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InfoLinksViewModel_InfoLinkViewHolder_MembersInjector
    implements MembersInjector<InfoLinksViewModel.InfoLinkViewHolder> {
  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public InfoLinksViewModel_InfoLinkViewHolder_MembersInjector(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<InfoLinksViewModel.InfoLinkViewHolder> create(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new InfoLinksViewModel_InfoLinkViewHolder_MembersInjector(mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(InfoLinksViewModel.InfoLinkViewHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMFragmentManager(
      InfoLinksViewModel.InfoLinkViewHolder instance,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
