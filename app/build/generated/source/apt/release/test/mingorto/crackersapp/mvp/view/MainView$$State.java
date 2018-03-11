package test.mingorto.crackersapp.mvp.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class MainView$$State extends MvpViewState<test.mingorto.crackersapp.mvp.view.MainView> implements test.mingorto.crackersapp.mvp.view.MainView {

	@Override
	public  void startSignIn() {
		StartSignInCommand startSignInCommand = new StartSignInCommand();
		mViewCommands.beforeApply(startSignInCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.MainView view : mViews) {
			view.startSignIn();
		}

		mViewCommands.afterApply(startSignInCommand);
	}

	@Override
	public  void signedIn() {
		SignedInCommand signedInCommand = new SignedInCommand();
		mViewCommands.beforeApply(signedInCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.MainView view : mViews) {
			view.signedIn();
		}

		mViewCommands.afterApply(signedInCommand);
	}

	@Override
	public  void showCurrentUser( test.mingorto.crackersapp.model.Profile profile) {
		ShowCurrentUserCommand showCurrentUserCommand = new ShowCurrentUserCommand(profile);
		mViewCommands.beforeApply(showCurrentUserCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.MainView view : mViews) {
			view.showCurrentUser(profile);
		}

		mViewCommands.afterApply(showCurrentUserCommand);
	}

	@Override
	public  void showFragmentFromDrawer( test.mingorto.crackersapp.ui.fragment.BaseFragment baseFragment) {
		ShowFragmentFromDrawerCommand showFragmentFromDrawerCommand = new ShowFragmentFromDrawerCommand(baseFragment);
		mViewCommands.beforeApply(showFragmentFromDrawerCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.MainView view : mViews) {
			view.showFragmentFromDrawer(baseFragment);
		}

		mViewCommands.afterApply(showFragmentFromDrawerCommand);
	}

	@Override
	public  void startActivityFromDrawer( java.lang.Class<?> act) {
		StartActivityFromDrawerCommand startActivityFromDrawerCommand = new StartActivityFromDrawerCommand(act);
		mViewCommands.beforeApply(startActivityFromDrawerCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.MainView view : mViews) {
			view.startActivityFromDrawer(act);
		}

		mViewCommands.afterApply(startActivityFromDrawerCommand);
	}


	public class StartSignInCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.MainView> {
		StartSignInCommand() {
			super("startSignIn", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.MainView mvpView) {
			mvpView.startSignIn();
		}
	}

	public class SignedInCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.MainView> {
		SignedInCommand() {
			super("signedIn", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.MainView mvpView) {
			mvpView.signedIn();
		}
	}

	public class ShowCurrentUserCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.MainView> {
		public final test.mingorto.crackersapp.model.Profile profile;

		ShowCurrentUserCommand( test.mingorto.crackersapp.model.Profile profile) {
			super("showCurrentUser", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.profile = profile;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.MainView mvpView) {
			mvpView.showCurrentUser(profile);
		}
	}

	public class ShowFragmentFromDrawerCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.MainView> {
		public final test.mingorto.crackersapp.ui.fragment.BaseFragment baseFragment;

		ShowFragmentFromDrawerCommand( test.mingorto.crackersapp.ui.fragment.BaseFragment baseFragment) {
			super("showFragmentFromDrawer", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.baseFragment = baseFragment;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.MainView mvpView) {
			mvpView.showFragmentFromDrawer(baseFragment);
		}
	}

	public class StartActivityFromDrawerCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.MainView> {
		public final java.lang.Class<?> act;

		StartActivityFromDrawerCommand( java.lang.Class<?> act) {
			super("startActivityFromDrawer", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.act = act;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.MainView mvpView) {
			mvpView.startActivityFromDrawer(act);
		}
	}
}
