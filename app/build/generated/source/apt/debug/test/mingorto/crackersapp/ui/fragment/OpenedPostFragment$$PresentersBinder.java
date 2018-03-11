package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class OpenedPostFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.OpenedPostFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedPostFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.OpenedPostFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.OpenedPostFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.OpenedPostPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedPostFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.OpenedPostFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
