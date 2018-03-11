// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class NewsItemBodyHolder_ViewBinding implements Unbinder {
  private NewsItemBodyHolder target;

  @UiThread
  public NewsItemBodyHolder_ViewBinding(NewsItemBodyHolder target, View source) {
    this.target = target;

    target.tvText = Utils.findRequiredViewAsType(source, R.id.tv_text, "field 'tvText'", TextView.class);
    target.tvAttachments = Utils.findRequiredViewAsType(source, R.id.tv_attachments, "field 'tvAttachments'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsItemBodyHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvText = null;
    target.tvAttachments = null;
  }
}
