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

public class OpenedPostRepostHeaderViewModel$OpenedPostRepostHolder_ViewBinding implements Unbinder {
  private OpenedPostRepostHeaderViewModel.OpenedPostRepostHolder target;

  @UiThread
  public OpenedPostRepostHeaderViewModel$OpenedPostRepostHolder_ViewBinding(OpenedPostRepostHeaderViewModel.OpenedPostRepostHolder target, View source) {
    this.target = target;

    target.repostImage = Utils.findRequiredViewAsType(source, R.id.civ_repost_profile_image, "field 'repostImage'", CircleImageView.class);
    target.repostName = Utils.findRequiredViewAsType(source, R.id.tv_repost_profile_name, "field 'repostName'", TextView.class);
    target.repostText = Utils.findRequiredViewAsType(source, R.id.tv_repost_text, "field 'repostText'", TextView.class);
    target.repostDate = Utils.findRequiredViewAsType(source, R.id.tv_repost_date, "field 'repostDate'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OpenedPostRepostHeaderViewModel.OpenedPostRepostHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.repostImage = null;
    target.repostName = null;
    target.repostText = null;
    target.repostDate = null;
  }
}
