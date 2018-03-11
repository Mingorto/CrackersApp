package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class OpenedCommentFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.OpenedCommentPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedCommentFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
