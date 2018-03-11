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

public class NewsItemFooterHolder_ViewBinding implements Unbinder {
  private NewsItemFooterHolder target;

  @UiThread
  public NewsItemFooterHolder_ViewBinding(NewsItemFooterHolder target, View source) {
    this.target = target;

    target.tvDate = Utils.findRequiredViewAsType(source, R.id.tv_date, "field 'tvDate'", TextView.class);
    target.tvLikesCount = Utils.findRequiredViewAsType(source, R.id.tv_likes_count, "field 'tvLikesCount'", TextView.class);
    target.tvLikesIcon = Utils.findRequiredViewAsType(source, R.id.tv_likes_icon, "field 'tvLikesIcon'", TextView.class);
    target.tvCommentsIcon = Utils.findRequiredViewAsType(source, R.id.tv_comments_icon, "field 'tvCommentsIcon'", TextView.class);
    target.tvCommentsCount = Utils.findRequiredViewAsType(source, R.id.tv_comments_count, "field 'tvCommentsCount'", TextView.class);
    target.tvRepostIcon = Utils.findRequiredViewAsType(source, R.id.tv_reposts_icon, "field 'tvRepostIcon'", TextView.class);
    target.tvRepostsCount = Utils.findRequiredViewAsType(source, R.id.tv_reposts_count, "field 'tvRepostsCount'", TextView.class);
    target.rlComments = Utils.findRequiredView(source, R.id.rl_comments, "field 'rlComments'");
    target.rlLikes = Utils.findRequiredView(source, R.id.rl_likes, "field 'rlLikes'");
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsItemFooterHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDate = null;
    target.tvLikesCount = null;
    target.tvLikesIcon = null;
    target.tvCommentsIcon = null;
    target.tvCommentsCount = null;
    target.tvRepostIcon = null;
    target.tvRepostsCount = null;
    target.rlComments = null;
    target.rlLikes = null;
  }
}
