package com.example.diseodeinterfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button btn;
    Button btn2;
    EditText editTextTextPersonName, editTextTextPersonName2, editTextTextPersonName3;
    TextView editTextTextPersonName4, editTextTextPersonName5, msj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = findViewById(R.id.button7);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        msj = findViewById(R.id.msj);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a = Double.parseDouble(editTextTextPersonName.getText().toString());
                Double b = Double.parseDouble(editTextTextPersonName2.getText().toString());
                Double c = Double.parseDouble(editTextTextPersonName3.getText().toString());

                Double x1 = (-b + (Math.sqrt(Math.pow(b,2) - (4*a*c))) /2*a);
                Double x2 = (-b - (Math.sqrt(Math.pow(b,2) - (4*a*c))) /2*a);
                Double D = Math.pow(b,2) - (4*a*c);

                editTextTextPersonName4.setText(x1 + "");
                editTextTextPersonName5.setText(x2 + "");

                if ( D >= 0){
                    msj.setText ("Tiene solucion con numeros reales");
                }
                else {
                    msj.setText("No tiene solucion con numeros reales");
                }

            }
        });

        btn2 = findViewById(R.id.button9);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}