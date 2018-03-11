// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.activity;

import android.support.annotation.UiThread;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class CreatePostActivity_ViewBinding extends BaseActivity_ViewBinding {
  private CreatePostActivity target;

  @UiThread
  public CreatePostActivity_ViewBinding(CreatePostActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CreatePostActivity_ViewBinding(CreatePostActivity target, View source) {
    super(target, source);

    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  public void unbind() {
    CreatePostActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;

    super.unbind();
  }
}
