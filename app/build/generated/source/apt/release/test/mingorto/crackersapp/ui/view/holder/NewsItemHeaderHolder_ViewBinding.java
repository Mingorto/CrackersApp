// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class NewsItemHeaderHolder_ViewBinding implements Unbinder {
  private NewsItemHeaderHolder target;

  @UiThread
  public NewsItemHeaderHolder_ViewBinding(NewsItemHeaderHolder target, View source) {
    this.target = target;

    target.civProfileImage = Utils.findRequiredViewAsType(source, R.id.civ_profile_image, "field 'civProfileImage'", CircleImageView.class);
    target.tvName = Utils.findRequiredViewAsType(source, R.id.tv_profile_name, "field 'tvName'", TextView.class);
    target.ivRepostedIcon = Utils.findRequiredViewAsType(source, R.id.iv_reposted_icon, "field 'ivRepostedIcon'", ImageView.class);
    target.tvRepostedProfileName = Utils.findRequiredViewAsType(source, R.id.tv_reposted_profile_name, "field 'tvRepostedProfileName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsItemHeaderHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.civProfileImage = null;
    target.tvName = null;
    target.ivRepostedIcon = null;
    target.tvRepostedProfileName = null;
  }
}
