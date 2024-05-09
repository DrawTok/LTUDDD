package com.example.sumapp.week5;


import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiUser {
    @GET("getAllUser")
    Observable<List<User>> getAllUser();
}
