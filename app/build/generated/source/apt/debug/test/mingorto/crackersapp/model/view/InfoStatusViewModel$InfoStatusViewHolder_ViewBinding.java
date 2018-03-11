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

public class InfoStatusViewModel$InfoStatusViewHolder_ViewBinding implements Unbinder {
  private InfoStatusViewModel.InfoStatusViewHolder target;

  @UiThread
  public InfoStatusViewModel$InfoStatusViewHolder_ViewBinding(InfoStatusViewModel.InfoStatusViewHolder target, View source) {
    this.target = target;

    target.tvStatustext = Utils.findRequiredViewAsType(source, R.id.tv_status_text, "field 'tvStatustext'", TextView.class);
    target.tvDescriptionText = Utils.findRequiredViewAsType(source, R.id.tv_description_text, "field 'tvDescriptionText'", TextView.class);
    target.tvSiteText = Utils.findRequiredViewAsType(source, R.id.tv_site_text, "field 'tvSiteText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InfoStatusViewModel.InfoStatusViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvStatustext = null;
    target.tvDescriptionText = null;
    target.tvSiteText = null;
  }
}
