// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.model.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class CreatePostTextViewModel$NewPostTextViewHolder_ViewBinding implements Unbinder {
  private CreatePostTextViewModel.NewPostTextViewHolder target;

  @UiThread
  public CreatePostTextViewModel$NewPostTextViewHolder_ViewBinding(CreatePostTextViewModel.NewPostTextViewHolder target, View source) {
    this.target = target;

    target.message = Utils.findRequiredViewAsType(source, R.id.et_message, "field 'message'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CreatePostTextViewModel.NewPostTextViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.message = null;
  }
}
