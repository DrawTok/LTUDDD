package com.example.sumapp.week5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sumapp.R;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Week5Activity extends AppCompatActivity {

    ApiUser apiUser;
    List<User> users;
    UserAdapter adapter;
    RecyclerView recyclerView;
    CompositeDisposable compositeDisposable = new CompositeDisposable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        recyclerView = findViewById(R.id.recycleViewW4);

        apiUser = RetrofitClient.getInstance("http://192.168.1.68:3000/api/")
                .create(ApiUser.class);
        compositeDisposable.add(apiUser.getAllUser().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(
                    data ->{
                        users = data;
                        adapter = new UserAdapter(users, getApplicationContext());
                        recyclerView.setAdapter(adapter);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this));

                    }


        ));
    }
}