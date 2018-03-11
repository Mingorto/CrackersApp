package test.mingorto.crackersapp.di.module;

import test.mingorto.crackersapp.common.manager.MyFragmentManager;
import test.mingorto.crackersapp.common.manager.NetworkManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class ManagerModule {
    @Provides
    @Singleton
    MyFragmentManager provideMyFragmentManager() {
        return new MyFragmentManager();
    }

    @Provides
    @Singleton
    NetworkManager provideNetworkManager() {
        return new NetworkManager();
    }
}
