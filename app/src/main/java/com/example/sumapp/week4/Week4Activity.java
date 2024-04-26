package com.example.sumapp.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sumapp.R;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Week4Activity extends AppCompatActivity {

    ApiCat apiUser;
    List<Cat> cats;
    CatAdapter adapter;
    RecyclerView recyclerView;
    CompositeDisposable compositeDisposable = new CompositeDisposable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        recyclerView = findViewById(R.id.recycleViewW4);

        apiUser = RetrofitClient.getInstance("https://66286fc154afcabd0735bf9b.mockapi.io/api/v1/")
                .create(ApiCat.class);
        compositeDisposable.add(apiUser.getAllCat().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(
                    data ->{
                        cats = data;
                        adapter = new CatAdapter(getApplicationContext(), cats);
                        recyclerView.setAdapter(adapter);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this));

                    }


        ));
    }
}