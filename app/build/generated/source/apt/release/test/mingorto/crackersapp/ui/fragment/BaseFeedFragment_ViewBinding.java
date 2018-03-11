// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class BaseFeedFragment_ViewBinding implements Unbinder {
  private BaseFeedFragment target;

  @UiThread
  public BaseFeedFragment_ViewBinding(BaseFeedFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_list, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseFeedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSwipeRefreshLayout = null;
  }
}
