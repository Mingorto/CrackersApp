package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class CommentsFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.CommentsFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.CommentsFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.CommentsPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.CommentsFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.CommentsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.CommentsFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.CommentsPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.CommentsFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.CommentsFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
