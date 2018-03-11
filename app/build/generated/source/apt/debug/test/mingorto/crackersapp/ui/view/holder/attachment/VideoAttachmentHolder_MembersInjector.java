package test.mingorto.crackersapp.ui.view.holder.attachment;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.rest.api.VideoApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VideoAttachmentHolder_MembersInjector
    implements MembersInjector<VideoAttachmentHolder> {
  private final Provider<VideoApi> mVideoApiProvider;

  public VideoAttachmentHolder_MembersInjector(Provider<VideoApi> mVideoApiProvider) {
    assert mVideoApiProvider != null;
    this.mVideoApiProvider = mVideoApiProvider;
  }

  public static MembersInjector<VideoAttachmentHolder> create(
      Provider<VideoApi> mVideoApiProvider) {
    return new VideoAttachmentHolder_MembersInjector(mVideoApiProvider);
  }

  @Override
  public void injectMembers(VideoAttachmentHolder instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mVideoApi = mVideoApiProvider.get();
  }

  public static void injectMVideoApi(
      VideoAttachmentHolder instance, Provider<VideoApi> mVideoApiProvider) {
    instance.mVideoApi = mVideoApiProvider.get();
  }
}
