package test.mingorto.crackersapp.di.module;

import test.mingorto.crackersapp.rest.RestClient;
import test.mingorto.crackersapp.rest.api.AccountApi;
import test.mingorto.crackersapp.rest.api.BoardApi;
import test.mingorto.crackersapp.rest.api.GroupsApi;
import test.mingorto.crackersapp.rest.api.UsersApi;
import test.mingorto.crackersapp.rest.api.VideoApi;
import test.mingorto.crackersapp.rest.api.WallApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class RestModule {
    private RestClient mRestClient;


    public RestModule() {
        mRestClient = new RestClient();
    }


    @Provides
    @Singleton
    public RestClient provideRestClient() {
        return mRestClient;
    }

    @Provides
    @Singleton
    public WallApi provideWallApi() {
        return mRestClient.createService(WallApi.class);
    }

    @Provides
    @Singleton
    public UsersApi provideUsersApi() {
        return mRestClient.createService(UsersApi.class);
    }

    @Provides
    @Singleton
    public GroupsApi provideGroupsApi() {
        return mRestClient.createService(GroupsApi.class);
    }

    @Provides
    @Singleton
    public BoardApi provideBoardApi(){
        return mRestClient.createService(BoardApi.class);
    }

    @Provides
    @Singleton
    public VideoApi provideVideoApi() {
        return mRestClient.createService(VideoApi.class);
    }

    @Provides
    @Singleton
    public AccountApi provideAccountApi() {
        return mRestClient.createService(AccountApi.class);
    }

}






















