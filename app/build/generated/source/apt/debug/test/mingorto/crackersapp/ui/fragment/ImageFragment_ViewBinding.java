// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class ImageFragment_ViewBinding implements Unbinder {
  private ImageFragment target;

  @UiThread
  public ImageFragment_ViewBinding(ImageFragment target, View source) {
    this.target = target;

    target.webView = Utils.findRequiredViewAsType(source, R.id.webview, "field 'webView'", WebView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ImageFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.webView = null;
  }
}
