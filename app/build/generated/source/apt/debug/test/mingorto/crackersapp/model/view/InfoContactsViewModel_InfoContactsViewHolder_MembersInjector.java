package test.mingorto.crackersapp.model.view;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InfoContactsViewModel_InfoContactsViewHolder_MembersInjector
    implements MembersInjector<InfoContactsViewModel.InfoContactsViewHolder> {
  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public InfoContactsViewModel_InfoContactsViewHolder_MembersInjector(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<InfoContactsViewModel.InfoContactsViewHolder> create(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new InfoContactsViewModel_InfoContactsViewHolder_MembersInjector(
        mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(InfoContactsViewModel.InfoContactsViewHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMFragmentManager(
      InfoContactsViewModel.InfoContactsViewHolder instance,
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
