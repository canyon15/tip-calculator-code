package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ten = (Button) findViewById(R.id.ten);
        Button fifteen = (Button) findViewById(R.id.fifteen);
        Button twenty = (Button) findViewById(R.id.twenty);


        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = 0.00;
                double t = 0.00;
                double pAT = 0.00;
                EditText price = findViewById(R.id.price);
                TextView tip = findViewById(R.id.tip);
                TextView tAP = findViewById(R.id.priceAndTip);
                p = Double.parseDouble(price.getText().toString());
                t = p * 0.10;
                pAT = p + t;
                tip.setText("$" + t);
                tAP.setText("$" + pAT);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = 0.00;
                double t = 0.00;
                double pAT = 0.00;
                EditText price = findViewById(R.id.price);
                TextView tip = findViewById(R.id.tip);
                TextView tAP = findViewById(R.id.priceAndTip);
                p = Double.parseDouble(price.getText().toString());
                t = p * 0.15;
                pAT = p + t;
                tip.setText("$" + t);
                tAP.setText("$" + pAT);
            }
        });

        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p = 0.00;
                double t = 0.00;
                double pAT = 0.00;
                EditText price = findViewById(R.id.price);
                TextView tip = findViewById(R.id.tip);
                TextView tAP = findViewById(R.id.priceAndTip);
                p = Double.parseDouble(price.getText().toString());
                t = p * 0.20;
                pAT = p + t;
                tip.setText("$" + t);
                tAP.setText("$" + pAT);
            }
        });
    }
}