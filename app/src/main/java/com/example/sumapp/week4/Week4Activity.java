package com.example.sumapp.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.sumapp.R;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Week4Activity extends AppCompatActivity {

    ApiUser apiUser;
    List<User> users;
    UserAdapter adapter;
    RecyclerView recyclerView;
    TextView tvB1;
    CompositeDisposable compositeDisposable = new CompositeDisposable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        tvB1 = findViewById(R.id.tvB1);
        recyclerView = findViewById(R.id.recycleViewW4);

        apiUser = RetrofitClient.getInstance("https://66286fc154afcabd0735bf9b.mockapi.io/api/v1/")
                .create(ApiUser.class);
        compositeDisposable.add(apiUser.getAllUser().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(
                    userModel ->{
                        users = userModel;
                        adapter = new UserAdapter(getApplicationContext(), users);
                        recyclerView.setAdapter(adapter);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this));
                        tvB1.setText(users.get(0).getName());

                    }


        ));
    }
}