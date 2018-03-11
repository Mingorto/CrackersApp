// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.model.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class InfoLinksViewModel$InfoLinkViewHolder_ViewBinding implements Unbinder {
  private InfoLinksViewModel.InfoLinkViewHolder target;

  @UiThread
  public InfoLinksViewModel$InfoLinkViewHolder_ViewBinding(InfoLinksViewModel.InfoLinkViewHolder target, View source) {
    this.target = target;

    target.rvLinks = Utils.findRequiredViewAsType(source, R.id.rv_links, "field 'rvLinks'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InfoLinksViewModel.InfoLinkViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvLinks = null;
  }
}
