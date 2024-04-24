package com.example.sumapp.week4;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiUser {
    @GET("users")
    Observable<List<User>> getAllUser();
}
