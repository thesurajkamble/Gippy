package com.example.github_mutual_followers.network;

import com.example.github_mutual_followers.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API_Interface {
    String BASE_URL = " https://api.github.com/";
    @GET("user")
    Call<List<User>> getUser();
}
