package test.mingorto.crackersapp.rest.api;


import test.mingorto.crackersapp.model.CommentItem;
import test.mingorto.crackersapp.model.Topic;
import test.mingorto.crackersapp.rest.model.response.BaseItemResponse;
import test.mingorto.crackersapp.rest.model.response.Full;
import test.mingorto.crackersapp.rest.model.response.ItemWithSendersResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface BoardApi {
    @GET(ApiMethods.BOARD_GET_TOPICS)
    Observable<Full<BaseItemResponse<Topic>>> getTopics(@QueryMap Map<String, String> map);

    @GET(ApiMethods.BOARD_GET_COMMENTS)
    Observable<Full<ItemWithSendersResponse<CommentItem>>> getComments(@QueryMap Map<String, String> map);
}
