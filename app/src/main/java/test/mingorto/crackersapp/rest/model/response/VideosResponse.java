package test.mingorto.crackersapp.rest.model.response;

import test.mingorto.crackersapp.model.attachment.video.Video;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VideosResponse {
    public int count;
    @SerializedName("items")
    @Expose
    public List<Video> items;
}