// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder.attachment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class ImageAttachmentHolder_ViewBinding implements Unbinder {
  private ImageAttachmentHolder target;

  @UiThread
  public ImageAttachmentHolder_ViewBinding(ImageAttachmentHolder target, View source) {
    this.target = target;

    target.image = Utils.findRequiredViewAsType(source, R.id.iv_attachment_image, "field 'image'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.image = null;
  }
}
