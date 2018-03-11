package test.mingorto.crackersapp.model.view.attachment;

import android.view.View;

import test.mingorto.crackersapp.model.attachment.Page;
import test.mingorto.crackersapp.model.view.BaseViewModel;
import test.mingorto.crackersapp.ui.view.holder.attachment.PageAttachmentHolder;

public class PageAttachmentViewModel extends BaseViewModel {

    private String mTitle;
    private String mUrl;

    public PageAttachmentViewModel(Page page) {
        mUrl = page.getUrl();
        mTitle = page.getTitle();
    }

    public String getTitle() {
        return mTitle;
    }


    @Override
    public LayoutTypes getType() {
        return LayoutTypes.AttachmentPage;
    }

    @Override
    public PageAttachmentHolder onCreateViewHolder(View view) {
        return new PageAttachmentHolder(view);
    }



    public String getmUrl() {
        return mUrl;
    }
}
