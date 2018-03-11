// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.model.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class CommentBodyViewModel$CommentBodyViewHolder_ViewBinding implements Unbinder {
  private CommentBodyViewModel.CommentBodyViewHolder target;

  @UiThread
  public CommentBodyViewModel$CommentBodyViewHolder_ViewBinding(CommentBodyViewModel.CommentBodyViewHolder target, View source) {
    this.target = target;

    target.tvText = Utils.findRequiredViewAsType(source, R.id.tv_text, "field 'tvText'", TextView.class);
    target.tvAttachments = Utils.findRequiredViewAsType(source, R.id.tv_attachments, "field 'tvAttachments'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentBodyViewModel.CommentBodyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvText = null;
    target.tvAttachments = null;
  }
}
