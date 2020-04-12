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

    public void mipolygon(View view) {
        startActivity(new Intent(this, MiPolygon.class));
    }

    public void mapacalor(View view) {
        startActivity(new Intent(this, MapaCalor.class));
    }

    public void mapacluster(View view) {
        startActivity(new Intent(this, MiClusterMap.class));
    }
}
