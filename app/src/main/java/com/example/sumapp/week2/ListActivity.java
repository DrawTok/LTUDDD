package com.example.sumapp.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.sumapp.R;
import com.example.sumapp.week2.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;

    List<String> titles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        titles.add("Text1");
        titles.add("Text2");
        titles.add("Text3");
        titles.add("Text4");
        titles.add("Text5");

        listAdapter = new ListAdapter(this, titles);

        listView.setAdapter(listAdapter);
    }
}