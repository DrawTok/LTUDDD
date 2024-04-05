package com.example.sumapp.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.sumapp.R;

public class SecondWeekActivity extends AppCompatActivity {

    TextView tvSum;
    Button btnDirectScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_week);

        tvSum = findViewById(R.id.tvSumW2);
btnDirectScreen = findViewById(R.id.btnDirectListScreen);

        Intent intent = getIntent();
        String num1 = String.valueOf(intent.getIntExtra("num1", 0));
        String num2 = String.valueOf(intent.getIntExtra("num2", 0));
        String sum = String.valueOf(intent.getIntExtra("sum", 0));

        tvSum.setText(String.format("%s + %s = %s", num1, num2, sum));

        btnDirectScreen.setOnClickListener(v->startActivity(new Intent(this, ListActivity.class)));
    }
}