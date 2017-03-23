package com.lazydev.mytask.controller;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIClient {
    public static final String BASE_URL = "http://164.132.145.149:7019/elk/";
    private static Retrofit retrofit = null;
    private static ApiInterface apiService = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiInterface getInterfaceInstacne(){
        if (apiService == null){
            apiService = APIClient.getClient().create(ApiInterface.class);
            return apiService;
        }else {
            return apiService;
        }
    }
}
