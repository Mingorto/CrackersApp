package test.mingorto.crackersapp.model.view;

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
import test.mingorto.crackersapp.model.CommentItem;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment;
import test.mingorto.crackersapp.ui.view.holder.BaseViewHolder;


public class CommentBodyViewModel extends BaseViewModel {

    private int mId;
    private String mText;
    private String mAttachmentsString;

    public CommentBodyViewModel(CommentItem commentItem) {
        this.mId = commentItem.getId();
        this.mText = commentItem.getDisplayText();
        this.mAttachmentsString = commentItem.getDisplayAttachmentsString();
    }

    @Override
    public boolean isItemDecorator() {
        return true;
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.CommentBody;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new CommentBodyViewHolder(view);
    }

    public int getId() {
        return mId;
    }

    public String getText() {
        return mText;
    }

    public String getAttachmentsString() {
        return mAttachmentsString;
    }

    public static class CommentBodyViewHolder extends BaseViewHolder<CommentBodyViewModel> {

        @Inject
        Typeface mGoogleFont;

        @Inject
        MyFragmentManager mFragmentManager;

        @BindView(R.id.tv_text)
        public TextView tvText;

        @BindView(R.id.tv_attachments)
        public TextView tvAttachments;

        public CommentBodyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            MyApplication.getApplicationComponent().inject(this);
            tvAttachments.setTypeface(mGoogleFont);
        }

        @Override
        public void bindViewHolder(CommentBodyViewModel commentBodyViewModel) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mFragmentManager.addFragment((BaseActivity) itemView.getContext(),
                            OpenedCommentFragment.newInstance(commentBodyViewModel.getId()), R.id.main_wrapper);
                }
            });

            UiHelper.getInstance().setUpTextViewWithMessage(tvText, commentBodyViewModel.getText(), "");
            UiHelper.getInstance().setUpTextViewWithVisibility(tvAttachments, commentBodyViewModel.getAttachmentsString());
        }

        @Override
        public void unbindViewHolder() {
            tvText.setText(null);
            tvAttachments.setText(null);
        }
    }
}

