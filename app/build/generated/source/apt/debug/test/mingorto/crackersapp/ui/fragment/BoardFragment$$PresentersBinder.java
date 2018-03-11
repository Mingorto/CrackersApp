package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class BoardFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.BoardFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.BoardFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.BoardPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.BoardFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.BoardPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.BoardFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.BoardPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.BoardFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.BoardFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
