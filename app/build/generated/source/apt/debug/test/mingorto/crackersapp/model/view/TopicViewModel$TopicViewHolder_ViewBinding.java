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

public class TopicViewModel$TopicViewHolder_ViewBinding implements Unbinder {
  private TopicViewModel.TopicViewHolder target;

  @UiThread
  public TopicViewModel$TopicViewHolder_ViewBinding(TopicViewModel.TopicViewHolder target, View source) {
    this.target = target;

    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.tvCommentsCount = Utils.findRequiredViewAsType(source, R.id.tv_comments_count, "field 'tvCommentsCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TopicViewModel.TopicViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.tvCommentsCount = null;
  }
}
