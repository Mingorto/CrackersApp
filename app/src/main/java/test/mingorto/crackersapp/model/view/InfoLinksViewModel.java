package test.mingorto.crackersapp.model.view;


import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.mingorto.crackersapp.MyApplication;
import test.mingorto.crackersapp.R;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.fragment.InfoLinksFragment;
import test.mingorto.crackersapp.ui.view.holder.BaseViewHolder;

public class InfoLinksViewModel extends BaseViewModel{



    @Override
    public LayoutTypes getType() {
        return LayoutTypes.InfoLinks;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(View view) {
        return new InfoLinkViewHolder(view);
    }

    public static class InfoLinkViewHolder extends BaseViewHolder<InfoLinksViewModel> {

        @Inject
        MyFragmentManager mFragmentManager;

        @BindView(R.id.rv_links)
        RelativeLayout rvLinks;

        public InfoLinkViewHolder(View itemView) {
            super(itemView);
            MyApplication.getApplicationComponent().inject(this);
            ButterKnife.bind(this, itemView);


        }

        @Override
        public void bindViewHolder(InfoLinksViewModel infoLinksViewModel) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("CLICK_LINK", "click to InfoLinksViewModel");
                    mFragmentManager.addFragment((BaseActivity) view.getContext(), new InfoLinksFragment(),
                           R.id.main_wrapper);



                }
            });

        }

        @Override
        public void unbindViewHolder() {

        }
    }
}
