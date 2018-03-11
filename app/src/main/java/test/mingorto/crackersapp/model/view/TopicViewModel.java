package test.mingorto.crackersapp.model.view;


import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.R;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.model.Place;
import test.mingorto.crackersapp.model.Topic;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment;
import test.mingorto.crackersapp.ui.view.holder.BaseViewHolder;

public class TopicViewModel extends  BaseViewModel{

    private int mid;
    private int mGroupid;
    private String mTitle;
    private String mCommentsCount;

    public TopicViewModel() {
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.Topic;
    }

    public TopicViewModel(Topic topic) {
        this.mid = topic.getId();
        this.mGroupid = topic.getGroupid();
        this.mTitle = topic.getTitle();
        this.mCommentsCount = topic.getComments() + " сообщений";
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(View view) {
        return new TopicViewHolder(view);
    }

    public int getId() {
        return mid;
    }

    public int getGroupid() {
        return mGroupid;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getCommentsCount() {
        return mCommentsCount;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setGroupid(int mGroupid) {
        this.mGroupid = mGroupid;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setCommentsCount(String mCommentsCount) {
        this.mCommentsCount = mCommentsCount;
    }

    public static class TopicViewHolder extends BaseViewHolder<TopicViewModel> {

        @BindView(R.id.tv_title)
        public TextView tvTitle;

        @BindView(R.id.tv_comments_count)
        public TextView tvCommentsCount;

        @Inject
        MyFragmentManager mFragmentManager;

        public TopicViewHolder(View itemView) {
            super(itemView);
            MyApplication.getApplicationComponent().inject(this);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void bindViewHolder(TopicViewModel topicViewModel) {
            tvTitle.setText(topicViewModel.getTitle());
            tvCommentsCount.setText(topicViewModel.getCommentsCount());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mFragmentManager.addFragment((BaseActivity) view.getContext(),
                            TopicCommentsFragment.newInstance(new Place(String.valueOf(topicViewModel.getGroupid()),
                                    String.valueOf(topicViewModel.getId()))),
                            R.id.main_wrapper);
                }
            });

        }

        @Override
        public void unbindViewHolder() {
            tvTitle.setText(null);
            tvCommentsCount.setText(null);

        }
    }
}

























