package test.mingorto.crackersapp.mvp.view;

import java.util.Set;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.ViewCommands;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategy;

public class BaseFeedView$$State extends MvpViewState<test.mingorto.crackersapp.mvp.view.BaseFeedView> implements test.mingorto.crackersapp.mvp.view.BaseFeedView {

	@Override
	public  void showRefreshing() {
		ShowRefreshingCommand showRefreshingCommand = new ShowRefreshingCommand();
		mViewCommands.beforeApply(showRefreshingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.showRefreshing();
		}

		mViewCommands.afterApply(showRefreshingCommand);
	}

	@Override
	public  void hideRefreshing() {
		HideRefreshingCommand hideRefreshingCommand = new HideRefreshingCommand();
		mViewCommands.beforeApply(hideRefreshingCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.hideRefreshing();
		}

		mViewCommands.afterApply(hideRefreshingCommand);
	}

	@Override
	public  void showListProgress() {
		ShowListProgressCommand showListProgressCommand = new ShowListProgressCommand();
		mViewCommands.beforeApply(showListProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.showListProgress();
		}

		mViewCommands.afterApply(showListProgressCommand);
	}

	@Override
	public  void hideListProgress() {
		HideListProgressCommand hideListProgressCommand = new HideListProgressCommand();
		mViewCommands.beforeApply(hideListProgressCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.hideListProgress();
		}

		mViewCommands.afterApply(hideListProgressCommand);
	}

	@Override
	public  void showError( java.lang.String message) {
		ShowErrorCommand showErrorCommand = new ShowErrorCommand(message);
		mViewCommands.beforeApply(showErrorCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.showError(message);
		}

		mViewCommands.afterApply(showErrorCommand);
	}

	@Override
	public  void setItems( java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items) {
		SetItemsCommand setItemsCommand = new SetItemsCommand(items);
		mViewCommands.beforeApply(setItemsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.setItems(items);
		}

		mViewCommands.afterApply(setItemsCommand);
	}

	@Override
	public  void addItems( java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items) {
		AddItemsCommand addItemsCommand = new AddItemsCommand(items);
		mViewCommands.beforeApply(addItemsCommand);

		if (mViews == null || mViews.isEmpty()) {
			return;
		}

		for(test.mingorto.crackersapp.mvp.view.BaseFeedView view : mViews) {
			view.addItems(items);
		}

		mViewCommands.afterApply(addItemsCommand);
	}


	public class ShowRefreshingCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		ShowRefreshingCommand() {
			super("showRefreshing", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.showRefreshing();
		}
	}

	public class HideRefreshingCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		HideRefreshingCommand() {
			super("hideRefreshing", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.hideRefreshing();
		}
	}

	public class ShowListProgressCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		ShowListProgressCommand() {
			super("showListProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.showListProgress();
		}
	}

	public class HideListProgressCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		HideListProgressCommand() {
			super("hideListProgress", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.hideListProgress();
		}
	}

	public class ShowErrorCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		public final java.lang.String message;

		ShowErrorCommand( java.lang.String message) {
			super("showError", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.message = message;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.showError(message);
		}
	}

	public class SetItemsCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		public final java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items;

		SetItemsCommand( java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items) {
			super("setItems", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.items = items;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.setItems(items);
		}
	}

	public class AddItemsCommand extends ViewCommand<test.mingorto.crackersapp.mvp.view.BaseFeedView> {
		public final java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items;

		AddItemsCommand( java.util.List<test.mingorto.crackersapp.model.view.BaseViewModel> items) {
			super("addItems", com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy.class);
			this.items = items;
		}

		@Override
		public void apply(test.mingorto.crackersapp.mvp.view.BaseFeedView mvpView) {
			mvpView.addItems(items);
		}
	}
}
