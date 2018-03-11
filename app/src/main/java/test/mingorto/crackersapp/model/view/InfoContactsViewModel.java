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
import test.mingorto.crackersapp.ui.fragment.InfoContactsFragment;
import test.mingorto.crackersapp.ui.view.holder.BaseViewHolder;

public class InfoContactsViewModel extends BaseViewModel{
    @Override
    public LayoutTypes getType() {
        return LayoutTypes.InfoContacts;
    }

    @Override
    public InfoContactsViewHolder onCreateViewHolder(View view) {
        return new InfoContactsViewHolder(view);
    }

    public static class InfoContactsViewHolder extends BaseViewHolder<InfoContactsViewModel> {

        @Inject
        MyFragmentManager mFragmentManager;

        @BindView(R.id.rv_contacts)
        RelativeLayout rvContacts;

        public InfoContactsViewHolder(View itemView) {
            super(itemView);
            MyApplication.getApplicationComponent().inject(this);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void bindViewHolder(InfoContactsViewModel infoContactsViewModel) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Log.d("CLICK_LINK", "click to InfoLinksViewModel");
                    mFragmentManager.addFragment((BaseActivity) view.getContext(), new InfoContactsFragment(),
                            R.id.main_wrapper);



                }
            });
        }

        @Override
        public void unbindViewHolder() {

        }
    }
}
