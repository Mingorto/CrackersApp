package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class TopicCommentsFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.TopicCommentsPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.TopicCommentsFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
