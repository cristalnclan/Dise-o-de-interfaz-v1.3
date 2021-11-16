package com.example.diseodeinterfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText Euro, Dolar;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Dolar = findViewById(R.id.Dolar);
        Euro = findViewById(R.id.Euro);
        btn1 = findViewById(R.id.button6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Euros=Euro.getText().toString();
                Double euros = Double.parseDouble(Euros);

                Double dolares=euros*1.13;
                String textoDolares = String.valueOf(dolares);

                Dolar.setText(textoDolares);

            }
        });

        btn2 = findViewById(R.id.button11);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}