package com.example.toolbarfragmentado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button btn_inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btn_inicio=findViewById(R.id.btn_comenzar);
        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Inicio.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}