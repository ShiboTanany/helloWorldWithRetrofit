package com.example.shibo.myapplication;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Created by shibo on 29/11/17.
 */

public interface GetGreeting {
    @GET("/greeting")
    Call<Greeting> getObject();

    @GET("login")
    Call<String> getUser(@Query("params[]")
                                 String email, @Query("params[]") String repo);


}
