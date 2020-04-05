package com.example.covid19;
import android.graphics.ColorSpace;

import com.example.covid19.Model.Feed;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    String BASE_URL = "https://hpb.health.gov.lk/api/";
    @Headers("Content-Type: application/json")
    @GET("get-current-statistical")
    Call<Feed> getFeed();





}
