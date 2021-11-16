package com.example.diseodeinterfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textView = (TextView) findViewById(R.id.Result);

        double imc = Double.parseDouble(getIntent().getStringExtra("imc"));

        if (imc <18.50){
            textView.setText("abajo del peso minimo");
        }

        else if(imc <25.00){
            textView.setText("peso correcto");
        }

        else if (imc <30.00){
            textView.setText("sobre peso");
        }
        else{
            textView.setText("obesidad");
        }

    }
}