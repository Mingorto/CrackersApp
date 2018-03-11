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

public class CommentFooterViewModel$CommentFooterHolder_ViewBinding implements Unbinder {
  private CommentFooterViewModel.CommentFooterHolder target;

  @UiThread
  public CommentFooterViewModel$CommentFooterHolder_ViewBinding(CommentFooterViewModel.CommentFooterHolder target, View source) {
    this.target = target;

    target.tvDate = Utils.findRequiredViewAsType(source, R.id.tv_date, "field 'tvDate'", TextView.class);
    target.rlLikes = Utils.findRequiredView(source, R.id.rl_likes, "field 'rlLikes'");
    target.tvLikesCount = Utils.findRequiredViewAsType(source, R.id.tv_likes_count, "field 'tvLikesCount'", TextView.class);
    target.tvLikesIcon = Utils.findRequiredViewAsType(source, R.id.tv_likes_icon, "field 'tvLikesIcon'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentFooterViewModel.CommentFooterHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDate = null;
    target.rlLikes = null;
    target.tvLikesCount = null;
    target.tvLikesIcon = null;
  }
}
