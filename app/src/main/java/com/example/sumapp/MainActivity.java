package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sumapp.week2.SecondWeekActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1, edtNum2;
    TextView tvSum;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewToId();

        btnCalc.setOnClickListener(v->{
            int num1 = Integer.parseInt(edtNum1.getText().toString());
            int num2 = Integer.parseInt(edtNum2.getText().toString());
            int sum = num1 + num2;

            Intent intent = new Intent(this, SecondWeekActivity.class);
            intent.putExtra("num1", num1);
            intent.putExtra("num2", num2);
            intent.putExtra("sum", sum);
            startActivity(intent);
        });

    }

    private void viewToId() {
        tvSum = findViewById(R.id.tvSum);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnCalc = findViewById(R.id.btnCalc);
    }
}