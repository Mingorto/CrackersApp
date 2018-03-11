package test.mingorto.crackersapp.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MembersFragment$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.fragment.MembersFragment> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.fragment.MembersFragment> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.MembersPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.fragment.MembersFragment target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.MembersPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.fragment.MembersFragment delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.MembersPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.fragment.MembersFragment>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.fragment.MembersFragment>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
