package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class InfoFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.InfoFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.InfoFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.InfoPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.InfoFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.InfoPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.InfoFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.InfoPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
