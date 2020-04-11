package com.mario21ic.parte1intermedio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MisEjemplos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_ejemplos);
    }

    public void mimapa(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void mipolyline(View view) {
        startActivity(new Intent(this, MiPolyLine.class));
    }
}
