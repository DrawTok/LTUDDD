package com.example.sumapp.week3;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sumapp.R;
import com.example.sumapp.week3.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView listView;
    ListAdapter listAdapter;

    List<Bank> bankList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        bankList.add(new Bank("Vietcombank", R.drawable.vcb, "01/04/1963"));
        bankList.add(new Bank("MB Bank", R.drawable.mb, "04/11/1994"));
        bankList.add(new Bank("BIDV", R.drawable.bidv, "26/04/1957"));
        bankList.add(new Bank("TP Bank", R.drawable.tpbank, "05/05/2008"));

        listAdapter = new ListAdapter(this, bankList);

        listView.setAdapter(listAdapter);
    }
}