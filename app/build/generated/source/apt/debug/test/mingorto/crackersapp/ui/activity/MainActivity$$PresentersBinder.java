package test.mingorto.crackersapp.ui.activity;

import java.util.ArrayList;
import java.util.List;

import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.presenter.PresenterType;

public class MainActivity$$PresentersBinder extends PresenterBinder<test.mingorto.crackersapp.ui.activity.MainActivity> {
	public class mPresenterBinder extends PresenterField<test.mingorto.crackersapp.ui.activity.MainActivity> {
		public mPresenterBinder() {
			super("mPresenter", PresenterType.LOCAL, null, test.mingorto.crackersapp.mvp.presenter.MainPresenter.class);
		}

		@Override
		public void bind(test.mingorto.crackersapp.ui.activity.MainActivity target, MvpPresenter presenter) {
			target.mPresenter = (test.mingorto.crackersapp.mvp.presenter.MainPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(test.mingorto.crackersapp.ui.activity.MainActivity delegated) {
			return new test.mingorto.crackersapp.mvp.presenter.MainPresenter();
		}
	}

	public List<PresenterField<test.mingorto.crackersapp.ui.activity.MainActivity>> getPresenterFields() {
		List<PresenterField<test.mingorto.crackersapp.ui.activity.MainActivity>> presenters = new ArrayList<>();

		presenters.add(new mPresenterBinder());

		return presenters;
	}

}
