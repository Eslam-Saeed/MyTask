package com.lazydev.mytask.controller;

import com.lazydev.mytask.model.Item;
import com.lazydev.mytask.model.ItemResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("{model}")
    Call<List<ItemResponse>> getMethod(@Path("model") String function, @Query("action") String action, @Query("type") String type);

}
