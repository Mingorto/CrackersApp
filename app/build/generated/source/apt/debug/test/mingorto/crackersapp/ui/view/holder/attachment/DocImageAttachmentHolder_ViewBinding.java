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

public class DocImageAttachmentHolder_ViewBinding implements Unbinder {
  private DocImageAttachmentHolder target;

  @UiThread
  public DocImageAttachmentHolder_ViewBinding(DocImageAttachmentHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.tv_attachment_title, "field 'title'", TextView.class);
    target.ext = Utils.findRequiredViewAsType(source, R.id.tv_attachment_ext, "field 'ext'", TextView.class);
    target.size = Utils.findRequiredViewAsType(source, R.id.tv_attachment_size, "field 'size'", TextView.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.iv_attachment_image, "field 'image'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DocImageAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.ext = null;
    target.size = null;
    target.image = null;
  }
}
