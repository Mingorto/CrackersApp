package test.mingorto.crackersapp.mvp.presenter;

import com.arellomobile.mvp.ViewStateProvider;
import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.MvpViewState;

public class TopicCommentsPresenter$$ViewStateProvider extends ViewStateProvider {
	
	@Override
	public MvpViewState<? extends MvpView> getViewState() {
		return new test.mingorto.crackersapp.mvp.view.BaseFeedView$$State();
	}
}