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

public class MemberViewModel$MemberViewHolder_ViewBinding implements Unbinder {
  private MemberViewModel.MemberViewHolder target;

  @UiThread
  public MemberViewModel$MemberViewHolder_ViewBinding(MemberViewModel.MemberViewHolder target, View source) {
    this.target = target;

    target.civProfilePhoto = Utils.findRequiredViewAsType(source, R.id.civ_profile_image, "field 'civProfilePhoto'", CircleImageView.class);
    target.civProfileName = Utils.findRequiredViewAsType(source, R.id.tv_profile_name, "field 'civProfileName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MemberViewModel.MemberViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.civProfilePhoto = null;
    target.civProfileName = null;
  }
}
