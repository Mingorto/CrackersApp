package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class InfoContactsFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.InfoContactsFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.InfoContactsFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.InfoContactsFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.InfoContactsFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.InfoContactsPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoContactsFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoContactsFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
