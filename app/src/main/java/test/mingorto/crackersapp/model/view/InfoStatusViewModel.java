package test.mingorto.crackersapp.model.view;


import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.mingorto.crackersapp.R;
import test.mingorto.crackersapp.model.Group;
import test.mingorto.crackersapp.ui.view.holder.BaseViewHolder;

public class InfoStatusViewModel extends BaseViewModel {

    private String mStatus;
    private String mDescription;
    private String mSite;

    public InfoStatusViewModel(Group group) {
        this.mStatus = group.getStatus();
        this.mDescription = group.getDescription();
        this.mSite = group.getSite();
    }

    @Override
    public LayoutTypes getType() {
        return LayoutTypes.InfoStatus;
    }

    @Override
    public InfoStatusViewHolder onCreateViewHolder(View view) {
        return new InfoStatusViewHolder(view);
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmSite() {
        return mSite;
    }

    static class InfoStatusViewHolder extends BaseViewHolder<InfoStatusViewModel> {

        @BindView(R.id.tv_status_text)
        public TextView tvStatustext;

        @BindView(R.id.tv_description_text)
        TextView tvDescriptionText;

        @BindView(R.id.tv_site_text)
        TextView tvSiteText;

        public InfoStatusViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void bindViewHolder(InfoStatusViewModel infoStatusViewModel) {

            tvStatustext.setText(infoStatusViewModel.getmStatus());
            tvDescriptionText.setText(infoStatusViewModel.getmDescription());
            tvSiteText.setText(infoStatusViewModel.getmSite());

        }

        @Override
        public void unbindViewHolder() {
            tvStatustext.setText(null);
            tvDescriptionText.setText(null);
            tvSiteText.setText(null);

        }
    }
}
















