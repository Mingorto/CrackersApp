package test.mingorto.crackersapp.model.view.attachment;

import android.view.View;

import test.mingorto.crackersapp.model.attachment.Photo;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.ui.view.holder.attachment.ImageAttachmentHolder;


public class ImageAttachmentViewModel extends BaseViewModel {

    private String mPhotoUrl;
    public boolean needClick = true;

    public ImageAttachmentViewModel(String url) {
        mPhotoUrl = url;

        needClick = false;
    }

    public ImageAttachmentViewModel(Photo photo) {
        mPhotoUrl = photo.getPhoto604();
    }


    @Override
    public LayoutTypes getType() {
        return LayoutTypes.AttachmentImage;
    }

    @Override
    public ImageAttachmentHolder onCreateViewHolder(View view) {
        return new ImageAttachmentHolder(view);
    }


    public String getPhotoUrl() {
        return mPhotoUrl;
    }
}
