// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class GroupRulesFragment_ViewBinding implements Unbinder {
  private GroupRulesFragment target;

  @UiThread
  public GroupRulesFragment_ViewBinding(GroupRulesFragment target, View source) {
    this.target = target;

    target.mWebView = Utils.findRequiredViewAsType(source, R.id.webview, "field 'mWebView'", WebView.class);

    Context context = source.getContext();
    Resources res = context.getResources();
    target.mTitle = res.getString(R.string.screen_name_rules);
  }

  @Override
  @CallSuper
  public void unbind() {
    GroupRulesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mWebView = null;
  }
}
