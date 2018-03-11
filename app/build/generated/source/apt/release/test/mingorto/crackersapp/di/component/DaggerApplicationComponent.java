package test.mingorto.crackersapp.di.component;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.common.manager.NetworkManager;
import test.mingorto.crackersapp.common.manager.NetworkManager_MembersInjector;
import test.mingorto.crackersapp.di.module.ApplicationModule;
import test.mingorto.crackersapp.di.module.ApplicationModule_ProvideContextFactory;
import test.mingorto.crackersapp.di.module.ApplicationModule_ProvideGoogleFontTypefaceFactory;
import test.mingorto.crackersapp.di.module.ApplicationModule_ProvideLayoutInflaterFactory;
import test.mingorto.crackersapp.di.module.ManagerModule;
import test.mingorto.crackersapp.di.module.ManagerModule_ProvideMyFragmentManagerFactory;
import test.mingorto.crackersapp.di.module.ManagerModule_ProvideNetworkManagerFactory;
import test.mingorto.crackersapp.di.module.RestModule;
import test.mingorto.crackersapp.di.module.RestModule_ProvideAccountApiFactory;
import test.mingorto.crackersapp.di.module.RestModule_ProvideBoardApiFactory;
import test.mingorto.crackersapp.di.module.RestModule_ProvideGroupsApiFactory;
import test.mingorto.crackersapp.di.module.RestModule_ProvideUsersApiFactory;
import test.mingorto.crackersapp.di.module.RestModule_ProvideVideoApiFactory;
import test.mingorto.crackersapp.di.module.RestModule_ProvideWallApiFactory;
import test.mingorto.crackersapp.model.view.CommentBodyViewModel;
import test.mingorto.crackersapp.model.view.CommentBodyViewModel_CommentBodyViewHolder_MembersInjector;
import test.mingorto.crackersapp.model.view.CommentFooterViewModel;
import test.mingorto.crackersapp.model.view.CommentFooterViewModel_CommentFooterHolder_MembersInjector;
import test.mingorto.crackersapp.model.view.InfoContactsViewModel;
import test.mingorto.crackersapp.model.view.InfoContactsViewModel_InfoContactsViewHolder_MembersInjector;
import test.mingorto.crackersapp.model.view.InfoLinksViewModel;
import test.mingorto.crackersapp.model.view.InfoLinksViewModel_InfoLinkViewHolder_MembersInjector;
import test.mingorto.crackersapp.model.view.TopicViewModel;
import test.mingorto.crackersapp.model.view.TopicViewModel_TopicViewHolder_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.BoardPresenter;
import test.mingorto.crackersapp.mvp.presenter.BoardPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.CommentsPresenter;
import test.mingorto.crackersapp.mvp.presenter.CommentsPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.InfoPresenter;
import test.mingorto.crackersapp.mvp.presenter.InfoPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.MainPresenter;
import test.mingorto.crackersapp.mvp.presenter.MainPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.MembersPresenter;
import test.mingorto.crackersapp.mvp.presenter.MembersPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter;
import test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter;
import test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter;
import test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter_MembersInjector;
import test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter;
import test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter_MembersInjector;
import test.mingorto.crackersapp.rest.api.AccountApi;
import test.mingorto.crackersapp.rest.api.BoardApi;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.api.UsersApi;
import test.mingorto.crackersapp.rest.api.VideoApi;
import test.mingorto.crackersapp.rest.api.WallApi;
import test.mingorto.crackersapp.ui.activity.BaseActivity;
import test.mingorto.crackersapp.ui.activity.BaseActivity_MembersInjector;
import test.mingorto.crackersapp.ui.activity.MainActivity;
import test.mingorto.crackersapp.ui.activity.MainActivity_MembersInjector;
import test.mingorto.crackersapp.ui.activity.OpenedPostFromPushActivity;
import test.mingorto.crackersapp.ui.activity.OpenedPostFromPushActivity_MembersInjector;
import test.mingorto.crackersapp.ui.fragment.CommentsFragment;
import test.mingorto.crackersapp.ui.fragment.InfoContactsFragment;
import test.mingorto.crackersapp.ui.fragment.InfoLinksFragment;
import test.mingorto.crackersapp.ui.fragment.NewsFeedFragment;
import test.mingorto.crackersapp.ui.fragment.NewsFeedFragment_MembersInjector;
import test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment;
import test.mingorto.crackersapp.ui.fragment.OpenedPostFragment;
import test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment;
import test.mingorto.crackersapp.ui.view.holder.NewsItemBodyHolder;
import test.mingorto.crackersapp.ui.view.holder.NewsItemBodyHolder_MembersInjector;
import test.mingorto.crackersapp.ui.view.holder.NewsItemFooterHolder;
import test.mingorto.crackersapp.ui.view.holder.NewsItemFooterHolder_MembersInjector;
import test.mingorto.crackersapp.ui.view.holder.attachment.ImageAttachmentHolder;
import test.mingorto.crackersapp.ui.view.holder.attachment.ImageAttachmentHolder_MembersInjector;
import test.mingorto.crackersapp.ui.view.holder.attachment.VideoAttachmentHolder;
import test.mingorto.crackersapp.ui.view.holder.attachment.VideoAttachmentHolder_MembersInjector;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<MyFragmentManager> provideMyFragmentManagerProvider;

  private Provider<LayoutInflater> provideLayoutInflaterProvider;

  private MembersInjector<BaseActivity> baseActivityMembersInjector;

  private Provider<AccountApi> provideAccountApiProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private MembersInjector<OpenedPostFromPushActivity> openedPostFromPushActivityMembersInjector;

  private Provider<WallApi> provideWallApiProvider;

  private MembersInjector<NewsFeedFragment> newsFeedFragmentMembersInjector;

  private Provider<Context> provideContextProvider;

  private Provider<Typeface> provideGoogleFontTypefaceProvider;

  private MembersInjector<NewsItemBodyHolder> newsItemBodyHolderMembersInjector;

  private MembersInjector<NewsItemFooterHolder> newsItemFooterHolderMembersInjector;

  private MembersInjector<ImageAttachmentHolder> imageAttachmentHolderMembersInjector;

  private Provider<VideoApi> provideVideoApiProvider;

  private MembersInjector<VideoAttachmentHolder> videoAttachmentHolderMembersInjector;

  private MembersInjector<CommentBodyViewModel.CommentBodyViewHolder>
      commentBodyViewHolderMembersInjector;

  private MembersInjector<CommentFooterViewModel.CommentFooterHolder>
      commentFooterHolderMembersInjector;

  private MembersInjector<TopicViewModel.TopicViewHolder> topicViewHolderMembersInjector;

  private MembersInjector<InfoLinksViewModel.InfoLinkViewHolder> infoLinkViewHolderMembersInjector;

  private MembersInjector<InfoContactsViewModel.InfoContactsViewHolder>
      infoContactsViewHolderMembersInjector;

  private Provider<NetworkManager> provideNetworkManagerProvider;

  private MembersInjector<NewsFeedPresenter> newsFeedPresenterMembersInjector;

  private Provider<UsersApi> provideUsersApiProvider;

  private MembersInjector<MainPresenter> mainPresenterMembersInjector;

  private Provider<GroupsApi> provideGroupsApiProvider;

  private MembersInjector<MembersPresenter> membersPresenterMembersInjector;

  private Provider<BoardApi> provideBoardApiProvider;

  private MembersInjector<BoardPresenter> boardPresenterMembersInjector;

  private MembersInjector<InfoPresenter> infoPresenterMembersInjector;

  private MembersInjector<OpenedPostPresenter> openedPostPresenterMembersInjector;

  private MembersInjector<CommentsPresenter> commentsPresenterMembersInjector;

  private MembersInjector<OpenedCommentPresenter> openedCommentPresenterMembersInjector;

  private MembersInjector<TopicCommentsPresenter> topicCommentsPresenterMembersInjector;

  private MembersInjector<InfoLinksPresenter> infoLinksPresenterMembersInjector;

  private MembersInjector<InfoContactsPresenter> infoContactsPresenterMembersInjector;

  private MembersInjector<NetworkManager> networkManagerMembersInjector;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideMyFragmentManagerProvider =
        DoubleCheck.provider(
            ManagerModule_ProvideMyFragmentManagerFactory.create(builder.managerModule));

    this.provideLayoutInflaterProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideLayoutInflaterFactory.create(builder.applicationModule));

    this.baseActivityMembersInjector =
        BaseActivity_MembersInjector.create(
            provideMyFragmentManagerProvider, provideLayoutInflaterProvider);

    this.provideAccountApiProvider =
        DoubleCheck.provider(RestModule_ProvideAccountApiFactory.create(builder.restModule));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(
            provideMyFragmentManagerProvider,
            provideLayoutInflaterProvider,
            provideAccountApiProvider);

    this.openedPostFromPushActivityMembersInjector =
        OpenedPostFromPushActivity_MembersInjector.create(
            provideMyFragmentManagerProvider, provideLayoutInflaterProvider);

    this.provideWallApiProvider =
        DoubleCheck.provider(RestModule_ProvideWallApiFactory.create(builder.restModule));

    this.newsFeedFragmentMembersInjector =
        NewsFeedFragment_MembersInjector.create(provideWallApiProvider);

    this.provideContextProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideContextFactory.create(builder.applicationModule));

    this.provideGoogleFontTypefaceProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvideGoogleFontTypefaceFactory.create(
                builder.applicationModule, provideContextProvider));

    this.newsItemBodyHolderMembersInjector =
        NewsItemBodyHolder_MembersInjector.create(
            provideGoogleFontTypefaceProvider, provideMyFragmentManagerProvider);

    this.newsItemFooterHolderMembersInjector =
        NewsItemFooterHolder_MembersInjector.create(
            provideWallApiProvider,
            provideGoogleFontTypefaceProvider,
            provideMyFragmentManagerProvider);

    this.imageAttachmentHolderMembersInjector =
        ImageAttachmentHolder_MembersInjector.create(provideMyFragmentManagerProvider);

    this.provideVideoApiProvider =
        DoubleCheck.provider(RestModule_ProvideVideoApiFactory.create(builder.restModule));

    this.videoAttachmentHolderMembersInjector =
        VideoAttachmentHolder_MembersInjector.create(provideVideoApiProvider);

    this.commentBodyViewHolderMembersInjector =
        CommentBodyViewModel_CommentBodyViewHolder_MembersInjector.create(
            provideGoogleFontTypefaceProvider, provideMyFragmentManagerProvider);

    this.commentFooterHolderMembersInjector =
        CommentFooterViewModel_CommentFooterHolder_MembersInjector.create(
            provideGoogleFontTypefaceProvider);

    this.topicViewHolderMembersInjector =
        TopicViewModel_TopicViewHolder_MembersInjector.create(provideMyFragmentManagerProvider);

    this.infoLinkViewHolderMembersInjector =
        InfoLinksViewModel_InfoLinkViewHolder_MembersInjector.create(
            provideMyFragmentManagerProvider);

    this.infoContactsViewHolderMembersInjector =
        InfoContactsViewModel_InfoContactsViewHolder_MembersInjector.create(
            provideMyFragmentManagerProvider);

    this.provideNetworkManagerProvider =
        DoubleCheck.provider(
            ManagerModule_ProvideNetworkManagerFactory.create(builder.managerModule));

    this.newsFeedPresenterMembersInjector =
        NewsFeedPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideWallApiProvider);

    this.provideUsersApiProvider =
        DoubleCheck.provider(RestModule_ProvideUsersApiFactory.create(builder.restModule));

    this.mainPresenterMembersInjector =
        MainPresenter_MembersInjector.create(
            provideMyFragmentManagerProvider,
            provideUsersApiProvider,
            provideNetworkManagerProvider);

    this.provideGroupsApiProvider =
        DoubleCheck.provider(RestModule_ProvideGroupsApiFactory.create(builder.restModule));

    this.membersPresenterMembersInjector =
        MembersPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideGroupsApiProvider);

    this.provideBoardApiProvider =
        DoubleCheck.provider(RestModule_ProvideBoardApiFactory.create(builder.restModule));

    this.boardPresenterMembersInjector =
        BoardPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideBoardApiProvider);

    this.infoPresenterMembersInjector =
        InfoPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideGroupsApiProvider);

    this.openedPostPresenterMembersInjector =
        OpenedPostPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideWallApiProvider);

    this.commentsPresenterMembersInjector =
        CommentsPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideWallApiProvider);

    this.openedCommentPresenterMembersInjector =
        OpenedCommentPresenter_MembersInjector.create(provideNetworkManagerProvider);

    this.topicCommentsPresenterMembersInjector =
        TopicCommentsPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideBoardApiProvider);

    this.infoLinksPresenterMembersInjector =
        InfoLinksPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideGroupsApiProvider);

    this.infoContactsPresenterMembersInjector =
        InfoContactsPresenter_MembersInjector.create(
            provideNetworkManagerProvider, provideGroupsApiProvider, provideUsersApiProvider);

    this.networkManagerMembersInjector =
        NetworkManager_MembersInjector.create(provideContextProvider);
  }

  @Override
  public void inject(BaseActivity activity) {
    baseActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(OpenedPostFromPushActivity activity) {
    openedPostFromPushActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(NewsFeedFragment fragment) {
    newsFeedFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenedPostFragment fragment) {
    MembersInjectors.<OpenedPostFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(OpenedCommentFragment fragment) {
    MembersInjectors.<OpenedCommentFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(CommentsFragment fragment) {
    MembersInjectors.<CommentsFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(TopicCommentsFragment fragment) {
    MembersInjectors.<TopicCommentsFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(InfoLinksFragment fragment) {
    MembersInjectors.<InfoLinksFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(InfoContactsFragment fragment) {
    MembersInjectors.<InfoContactsFragment>noOp().injectMembers(fragment);
  }

  @Override
  public void inject(NewsItemBodyHolder holder) {
    newsItemBodyHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(NewsItemFooterHolder holder) {
    newsItemFooterHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(ImageAttachmentHolder holder) {
    imageAttachmentHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(VideoAttachmentHolder holder) {
    videoAttachmentHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(CommentBodyViewModel.CommentBodyViewHolder holder) {
    commentBodyViewHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(CommentFooterViewModel.CommentFooterHolder holder) {
    commentFooterHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(TopicViewModel.TopicViewHolder holder) {
    topicViewHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(InfoLinksViewModel.InfoLinkViewHolder holder) {
    infoLinkViewHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(InfoContactsViewModel.InfoContactsViewHolder holder) {
    infoContactsViewHolderMembersInjector.injectMembers(holder);
  }

  @Override
  public void inject(NewsFeedPresenter presenter) {
    newsFeedPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(MainPresenter presenter) {
    mainPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(MembersPresenter presenter) {
    membersPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(BoardPresenter presenter) {
    boardPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(InfoPresenter presenter) {
    infoPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(OpenedPostPresenter presenter) {
    openedPostPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(CommentsPresenter presenter) {
    commentsPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(OpenedCommentPresenter presenter) {
    openedCommentPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(TopicCommentsPresenter presenter) {
    topicCommentsPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(InfoLinksPresenter presenter) {
    infoLinksPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(InfoContactsPresenter presenter) {
    infoContactsPresenterMembersInjector.injectMembers(presenter);
  }

  @Override
  public void inject(NetworkManager manager) {
    networkManagerMembersInjector.injectMembers(manager);
  }

  public static final class Builder {
    private ManagerModule managerModule;

    private ApplicationModule applicationModule;

    private RestModule restModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (managerModule == null) {
        this.managerModule = new ManagerModule();
      }
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      if (restModule == null) {
        this.restModule = new RestModule();
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder restModule(RestModule restModule) {
      this.restModule = Preconditions.checkNotNull(restModule);
      return this;
    }

    public Builder managerModule(ManagerModule managerModule) {
      this.managerModule = Preconditions.checkNotNull(managerModule);
      return this;
    }
  }
}
