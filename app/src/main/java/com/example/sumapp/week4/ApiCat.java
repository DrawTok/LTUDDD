package com.example.sumapp.week4;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiCat {
    @GET("cats")
    Observable<List<Cat>> getAllCat();
}
