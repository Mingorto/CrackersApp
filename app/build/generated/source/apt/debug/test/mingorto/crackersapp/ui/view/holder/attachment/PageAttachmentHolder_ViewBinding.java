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

public class PageAttachmentHolder_ViewBinding implements Unbinder {
  private PageAttachmentHolder target;

  @UiThread
  public PageAttachmentHolder_ViewBinding(PageAttachmentHolder target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PageAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
  }
}
