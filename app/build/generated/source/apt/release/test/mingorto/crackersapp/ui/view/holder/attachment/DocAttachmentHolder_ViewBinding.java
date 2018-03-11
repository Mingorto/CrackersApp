// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder.attachment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class DocAttachmentHolder_ViewBinding implements Unbinder {
  private DocAttachmentHolder target;

  @UiThread
  public DocAttachmentHolder_ViewBinding(DocAttachmentHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.tv_attachment_title, "field 'title'", TextView.class);
    target.ext = Utils.findRequiredViewAsType(source, R.id.tv_attachment_ext, "field 'ext'", TextView.class);
    target.size = Utils.findRequiredViewAsType(source, R.id.tv_attachment_size, "field 'size'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DocAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.ext = null;
    target.size = null;
  }
}
