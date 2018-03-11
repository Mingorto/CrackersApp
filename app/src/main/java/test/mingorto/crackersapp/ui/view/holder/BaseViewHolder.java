package test.mingorto.crackersapp.ui.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import test.mingorto.crackersapp.model.view.BaseViewModel;

/**
 * Created by user on 15.08.2017.
 */

public abstract class BaseViewHolder<Item extends BaseViewModel> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindViewHolder(Item item);

    public abstract void unbindViewHolder();
}
