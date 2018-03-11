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

public class LinkAttachmentViewHolder_ViewBinding implements Unbinder {
  private LinkAttachmentViewHolder target;

  @UiThread
  public LinkAttachmentViewHolder_ViewBinding(LinkAttachmentViewHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'title'", TextView.class);
    target.url = Utils.findRequiredViewAsType(source, R.id.tv_attachment_url, "field 'url'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    LinkAttachmentViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.url = null;
  }
}
