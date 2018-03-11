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

public class InfoContactsViewModel$InfoContactsViewHolder_ViewBinding implements Unbinder {
  private InfoContactsViewModel.InfoContactsViewHolder target;

  @UiThread
  public InfoContactsViewModel$InfoContactsViewHolder_ViewBinding(InfoContactsViewModel.InfoContactsViewHolder target, View source) {
    this.target = target;

    target.rvContacts = Utils.findRequiredViewAsType(source, R.id.rv_contacts, "field 'rvContacts'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    InfoContactsViewModel.InfoContactsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvContacts = null;
  }
}
