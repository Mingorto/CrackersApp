package test.mingorto.crackersapp.model.view.attachment;

import android.view.View;

import test.mingorto.crackersapp.model.attachment.Link;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.ui.view.holder.attachment.LinkAttachmentViewHolder;

public class LinkAttachmentViewModel extends BaseViewModel {

    private String mTitle;
    private String mUrl;

    public LinkAttachmentViewModel(Link link) {

        if (link.getTitle() == null || link.getTitle().equals("")) {
            if (link.getName() != null) {
                mTitle = link.getName();
            } else {
                mTitle = "Link";
            }
        } else {
            mTitle = link.getTitle();
        }

        mUrl = link.getUrl();
    }


    @Override
    public LayoutTypes getType() {
        return LayoutTypes.AttachmentLink;
    }

    @Override
    public LinkAttachmentViewHolder onCreateViewHolder(View view) {
        return new LinkAttachmentViewHolder(view);
    }



    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }
}
