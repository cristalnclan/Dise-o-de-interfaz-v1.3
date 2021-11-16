package com.example.diseodeinterfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calcularIMC (View view){
        EditText alturatxt = (EditText) findViewById(R.id.Altura);
        EditText pesotxt = (EditText)  findViewById(R.id.Peso);

        double altura = Double.parseDouble(alturatxt.getText().toString());
        double peso = Double.parseDouble(pesotxt.getText().toString());

        double imc = peso / (altura * altura);

        Intent intent = new Intent(MainActivity2.this, ResultActivity.class);
        intent.putExtra("imc", String.valueOf(imc));
        startActivity(intent);

        btn1 = findViewById(R.id.button8);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}