// Generated code from Butter Knife. Do not modify!
package test.mingorto.crackersapp.ui.view.holder.attachment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import test.mingorto.crackersapp.R;

public class AudioAttachmentHolder_ViewBinding implements Unbinder {
  private AudioAttachmentHolder target;

  @UiThread
  public AudioAttachmentHolder_ViewBinding(AudioAttachmentHolder target, View source) {
    this.target = target;

    target.name = Utils.findRequiredViewAsType(source, R.id.tv_audio_name, "field 'name'", TextView.class);
    target.artist = Utils.findRequiredViewAsType(source, R.id.tv_audio_artist, "field 'artist'", TextView.class);
    target.duration = Utils.findRequiredViewAsType(source, R.id.tv_audio_duration, "field 'duration'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioAttachmentHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.name = null;
    target.artist = null;
    target.duration = null;
  }
}
