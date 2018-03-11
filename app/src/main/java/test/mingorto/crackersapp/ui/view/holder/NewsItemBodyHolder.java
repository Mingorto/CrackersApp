package test.mingorto.crackersapp.ui.view.holder;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.R;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.common.utils.UiHelper;
import test.mingorto.crackersapp.model.view.NewsItemBodyViewModel;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.fragment.OpenedPostFragment;


public class NewsItemBodyHolder extends BaseViewHolder<NewsItemBodyViewModel> {

    @BindView(R.id.tv_text)
    public TextView tvText;

    @BindView(R.id.tv_attachments)
    public TextView tvAttachments;

    @Inject
    protected Typeface mFontGoogle;

    @Inject
    MyFragmentManager myFragmentManager;


    public NewsItemBodyHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        MyApplication.getApplicationComponent().inject(this);

        if (tvAttachments != null) {
            tvAttachments.setTypeface(mFontGoogle);
        }
    }

    @Override
    public void bindViewHolder(NewsItemBodyViewModel item) {
        tvText.setText(item.getText());
        tvAttachments.setText(item.getAttachmentString());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myFragmentManager.addFragment((BaseActivity) view.getContext(),
                        OpenedPostFragment.newInstance(item.getId()),
                        R.id.main_wrapper);

            }
        });
        UiHelper.getInstance().setUpTextViewWithVisibility(tvText, item.getText());
        UiHelper.getInstance().setUpTextViewWithVisibility(tvAttachments, item.getAttachmentString());
    }

    @Override
    public void unbindViewHolder() {
        tvText.setText(null);
        tvAttachments.setText(null);
        itemView.setOnClickListener(null);
    }
}
