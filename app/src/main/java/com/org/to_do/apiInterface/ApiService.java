package com.org.to_do.apiInterface;
import com.org.to_do.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface ApiService {
    @GET("/login") // Matches your Spring Boot endpoint
    Call<User> getUsers();

    @POST("/register")
    Call<User> createUser(@Body User user);
}
