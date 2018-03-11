package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class NewsFeedFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.NewsFeedFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.NewsFeedFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.NewsFeedFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.NewsFeedFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.NewsFeedPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.NewsFeedFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.NewsFeedFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
