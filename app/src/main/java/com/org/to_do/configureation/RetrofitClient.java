package com.org.to_do.configureation;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl) // Base URL of your API
                    .addConverterFactory(GsonConverterFactory.create()) // JSON to Java Object
                    .build();
        }
        return retrofit;
    }
}



