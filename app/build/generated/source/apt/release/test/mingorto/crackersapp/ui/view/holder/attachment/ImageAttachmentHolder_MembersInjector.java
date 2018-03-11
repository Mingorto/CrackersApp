package test.mingorto.crackersapp.ui.view.holder.attachment;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ImageAttachmentHolder_MembersInjector
    implements MembersInjector<ImageAttachmentHolder> {
  private final Provider<MyFragmentManager> mFragmentManagerProvider;

  public ImageAttachmentHolder_MembersInjector(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    assert mFragmentManagerProvider != null;
    this.mFragmentManagerProvider = mFragmentManagerProvider;
  }

  public static MembersInjector<ImageAttachmentHolder> create(
      Provider<MyFragmentManager> mFragmentManagerProvider) {
    return new ImageAttachmentHolder_MembersInjector(mFragmentManagerProvider);
  }

  @Override
  public void injectMembers(ImageAttachmentHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }

  public static void injectMFragmentManager(
      ImageAttachmentHolder instance, Provider<MyFragmentManager> mFragmentManagerProvider) {
    instance.mFragmentManager = mFragmentManagerProvider.get();
  }
}
