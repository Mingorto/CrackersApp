// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.fragment;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class OpenedPostFragment_ViewBinding extends BaseFeedFragment_ViewBinding {
  private OpenedPostFragment target;

  @UiThread
  public OpenedPostFragment_ViewBinding(OpenedPostFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mFooter = Utils.findRequiredView(source, R.id.rv_footer, "field 'mFooter'");
  }

  @Override
  public void unbind() {
    OpenedPostFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFooter = null;

    super.unbind();
  }
}
