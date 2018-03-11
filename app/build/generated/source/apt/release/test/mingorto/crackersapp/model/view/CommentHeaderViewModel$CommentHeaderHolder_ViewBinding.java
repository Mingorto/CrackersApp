// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.model.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class CommentHeaderViewModel$CommentHeaderHolder_ViewBinding implements Unbinder {
  private CommentHeaderViewModel.CommentHeaderHolder target;

  @UiThread
  public CommentHeaderViewModel$CommentHeaderHolder_ViewBinding(CommentHeaderViewModel.CommentHeaderHolder target, View source) {
    this.target = target;

    target.civProfileImage = Utils.findRequiredViewAsType(source, R.id.civ_profile_image, "field 'civProfileImage'", CircleImageView.class);
    target.tvName = Utils.findRequiredViewAsType(source, R.id.tv_profile_name, "field 'tvName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CommentHeaderViewModel.CommentHeaderHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.civProfileImage = null;
    target.tvName = null;
  }
}
