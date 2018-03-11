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

public class OpenedPostHeaderViewModel$OpenedPostHeaderHolder_ViewBinding implements Unbinder {
  private OpenedPostHeaderViewModel.OpenedPostHeaderHolder target;

  @UiThread
  public OpenedPostHeaderViewModel$OpenedPostHeaderHolder_ViewBinding(OpenedPostHeaderViewModel.OpenedPostHeaderHolder target, View source) {
    this.target = target;

    target.profilePhoto = Utils.findRequiredViewAsType(source, R.id.civ_profile_image, "field 'profilePhoto'", CircleImageView.class);
    target.profileName = Utils.findRequiredViewAsType(source, R.id.tv_profile_name, "field 'profileName'", TextView.class);
    target.text = Utils.findRequiredViewAsType(source, R.id.tv_text, "field 'text'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OpenedPostHeaderViewModel.OpenedPostHeaderHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.profilePhoto = null;
    target.profileName = null;
    target.text = null;
  }
}
