package test.mingorto.crackersapp.rest.api;

import test.mingorto.crackersapp.rest.model.response.Full;
import test.mingorto.crackersapp.rest.model.response.VideosResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface VideoApi {
    @GET(ApiMethods.VIDEO_GET)
    Observable<Full<VideosResponse>> get(@QueryMap Map<String, String> map);
}
