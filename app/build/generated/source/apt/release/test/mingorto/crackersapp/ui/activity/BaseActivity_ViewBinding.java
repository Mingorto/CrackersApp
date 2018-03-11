// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class BaseActivity_ViewBinding implements Unbinder {
  private BaseActivity target;

  @UiThread
  public BaseActivity_ViewBinding(BaseActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseActivity_ViewBinding(BaseActivity target, View source) {
    this.target = target;

    target.mProgressBar = Utils.findRequiredViewAsType(source, R.id.progress, "field 'mProgressBar'", ProgressBar.class);
    target.mParent = Utils.findRequiredViewAsType(source, R.id.main_wrapper, "field 'mParent'", FrameLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.mFab = Utils.findRequiredViewAsType(source, R.id.fab, "field 'mFab'", FloatingActionButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mProgressBar = null;
    target.mParent = null;
    target.toolbar = null;
    target.mFab = null;
  }
}
