package com.arellomobile.mvp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoxyReflector {

	private static Map<Class<?>, Object> sViewStateProviders;
	private static Map<Class<?>, List<Object>> sPresenterBinders;
	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.BoardPresenter.class, new test.mingorto.crackersapp.mvp.presenter.BoardPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.CommentsPresenter.class, new test.mingorto.crackersapp.mvp.presenter.CommentsPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter.class, new test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter.class, new test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.InfoPresenter.class, new test.mingorto.crackersapp.mvp.presenter.InfoPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.MainPresenter.class, new test.mingorto.crackersapp.mvp.presenter.MainPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.MembersPresenter.class, new test.mingorto.crackersapp.mvp.presenter.MembersPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter.class, new test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter.class, new test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter.class, new test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter$$ViewStateProvider());
		sViewStateProviders.put(test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter.class, new test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter$$ViewStateProvider());
		
		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(test.mingorto.crackersapp.ui.activity.MainActivity.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.activity.MainActivity$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.BoardFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.BoardFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.CommentsFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.CommentsFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.InfoContactsFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.InfoContactsFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.InfoFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.InfoFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.InfoLinksFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.InfoLinksFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.MembersFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.MembersFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.NewsFeedFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.NewsFeedFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.OpenedPostFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.OpenedPostFragment$$PresentersBinder()));
		sPresenterBinders.put(test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment.class, Arrays.<Object>asList(new test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment$$PresentersBinder()));
		
		sStrategies = new HashMap<>();
		sStrategies.put(com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class, new com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy());
	}
	
	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}
		
		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
