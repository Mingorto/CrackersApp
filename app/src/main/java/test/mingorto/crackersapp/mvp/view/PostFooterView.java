package test.mingorto.crackersapp.mvp.view;

        import com.arellomobile.mvp.MvpView;
        import test.mingorto.crackersapp.model.WallItem;
        import test.mingorto.crackersapp.model.view.counter.LikeCounterViewModel;

public interface PostFooterView extends MvpView {
    void like(LikeCounterViewModel likes);

    void openComments(WallItem wallItem);
}
