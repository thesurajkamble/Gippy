package com.example.github_mutual_followers.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitClient {
    private static RetrofitClient instance = null;
    private API_Interface myApi;

    private retrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API_Interface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(API_Interface.class);
    }

    public static synchronized retrofitClientetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public Api getMyApi() {
        return myApi;
    }
}
