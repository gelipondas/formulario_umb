package com.flix.umbapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_second);
        getSupportActionBar().setTitle("Resultados");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        TextView name = findViewById(R.id.name);
        TextView edad = findViewById(R.id.edad);
        TextView pocicion = findViewById(R.id.pocicion);
        TextView eps = findViewById(R.id.eps);

        name.setText("Nombre: "+getIntent().getStringExtra("name"));
        edad.setText("Edad: "+getIntent().getStringExtra("edad"));
        pocicion.setText("Pocision: "+getIntent().getStringExtra("pocision"));
        eps.setText("Eps: "+getIntent().getStringExtra("eps"));

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}