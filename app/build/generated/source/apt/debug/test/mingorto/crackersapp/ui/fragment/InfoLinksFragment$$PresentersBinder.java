package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class InfoLinksFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.InfoLinksFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.InfoLinksFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.InfoLinksFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.InfoLinksFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.InfoLinksPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoLinksFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.InfoLinksFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
