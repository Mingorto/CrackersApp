package test.mingorto.crackersapp.di.component;

import javax.inject.Singleton;

import dagger.Component;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.di.module.ApplicationModule;
import test.mingorto.crackersapp.di.module.ManagerModule;
import test.mingorto.crackersapp.di.module.RestModule;
import test.mingorto.crackersapp.model.view.CommentBodyViewModel;
import test.mingorto.crackersapp.model.view.CommentFooterViewModel;
import test.mingorto.crackersapp.model.view.InfoContactsViewModel;
import test.mingorto.crackersapp.model.view.InfoLinksViewModel;
import test.mingorto.crackersapp.model.view.TopicViewModel;
import test.mingorto.crackersapp.mvp.presenter.BoardPresenter;
import test.mingorto.crackersapp.mvp.presenter.CommentsPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoPresenter;
import test.mingorto.crackersapp.mvp.presenter.MainPresenter;
import test.mingorto.crackersapp.mvp.presenter.MembersPresenter;
import test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter;
import test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter;
import test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter;
import test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.activity.MainActivity;
import test.mingorto.crackersapp.ui.activity.OpenedPostFromPushActivity;
import test.mingorto.crackersapp.ui.fragment.CommentsFragment;
import test.mingorto.crackersapp.ui.fragment.InfoContactsFragment;
import test.mingorto.crackersapp.ui.fragment.InfoLinksFragment;
import test.mingorto.crackersapp.ui.fragment.NewsFeedFragment;
import test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment;
import test.mingorto.crackersapp.ui.fragment.OpenedPostFragment;
import test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment;
import test.mingorto.crackersapp.ui.view.holder.NewsItemBodyHolder;
import test.mingorto.crackersapp.ui.view.holder.NewsItemFooterHolder;
import test.mingorto.crackersapp.ui.view.holder.attachment.ImageAttachmentHolder;
import test.mingorto.crackersapp.ui.view.holder.attachment.VideoAttachmentHolder;


@Singleton
@Component(
        modules = {ApplicationModule.class, RestModule.class, ManagerModule.class})
public interface ApplicationComponent {

    //activities
    void inject(BaseActivity activity);
    void inject(MainActivity activity);
    void inject(OpenedPostFromPushActivity activity);

    //fragments
    void inject(NewsFeedFragment fragment);
    void inject(OpenedPostFragment fragment);
    void inject(OpenedCommentFragment fragment);
    void inject(CommentsFragment fragment);
    void inject(TopicCommentsFragment fragment);
    void inject(InfoLinksFragment fragment);
    void inject(InfoContactsFragment fragment);

    //holders
    void inject(NewsItemBodyHolder holder);
    void inject(NewsItemFooterHolder holder);
    void inject(ImageAttachmentHolder holder);
    void inject(VideoAttachmentHolder holder);
    void inject(CommentBodyViewModel.CommentBodyViewHolder holder);
    void inject(CommentFooterViewModel.CommentFooterHolder holder);
    void inject(TopicViewModel.TopicViewHolder holder);
    void inject(InfoLinksViewModel.InfoLinkViewHolder holder);
    void inject(InfoContactsViewModel.InfoContactsViewHolder holder);

    //presenters
    void inject(NewsFeedPresenter presenter);
    void inject(MainPresenter presenter);
    void inject(MembersPresenter presenter);
    void inject(BoardPresenter presenter);
    void inject(InfoPresenter presenter);
    void inject(OpenedPostPresenter presenter);
    void inject(CommentsPresenter presenter);
    void inject(OpenedCommentPresenter presenter);
    void inject(TopicCommentsPresenter presenter);
    void inject(InfoLinksPresenter presenter);
    void inject(InfoContactsPresenter presenter);

    //managers
    void inject(NetworkManager manager);


}
