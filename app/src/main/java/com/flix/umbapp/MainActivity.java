package com.flix.umbapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        Button buttonFirst = findViewById(R.id.button_first);
        TextInputEditText email = findViewById(R.id.editTextEmail);
        TextInputEditText year = findViewById(R.id.editTextEdad);
        TextInputEditText pocicion = findViewById(R.id.editTextPocicion);
        TextInputEditText eps = findViewById(R.id.editTextEps);

        buttonFirst.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("name",email.getText().toString());
            i.putExtra("edad",year.getText().toString());
            i.putExtra("pocision",pocicion.getText().toString());
            i.putExtra("eps",eps.getText().toString());
            startActivity(i);
        });
    }

}