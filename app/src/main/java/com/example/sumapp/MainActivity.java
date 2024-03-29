package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
            int sum = Integer.parseInt(edtNum1.getText().toString())
                    + Integer.parseInt(edtNum2.getText().toString());
            tvSum.setText(String.valueOf(sum));
        });

    }

    private void viewToId() {
        tvSum = findViewById(R.id.tvSum);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnCalc = findViewById(R.id.btnCalc);
    }
}