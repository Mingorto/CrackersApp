// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder.attachment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class VideoAttachmentHolder_ViewBinding implements Unbinder {
  private VideoAttachmentHolder target;

  @UiThread
  public VideoAttachmentHolder_ViewBinding(VideoAttachmentHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.tv_attachment_video_title, "field 'title'", TextView.class);
    target.duration = Utils.findRequiredViewAsType(source, R.id.tv_attachment_video_duration, "field 'duration'", TextView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.iv_attachment_video_picture, "field 'image'", ImageView.class);
    target.views = Utils.findRequiredViewAsType(source, R.id.tv_views_count, "field 'views'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.duration = null;
    target.image = null;
    target.views = null;
  }
}
