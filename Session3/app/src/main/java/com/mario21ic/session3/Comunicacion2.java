package com.mario21ic.session3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Comunicacion2 extends AppCompatActivity {
    TextView txtmensaje;
    String nombre;
    int edad;
    int evaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion2);

        // Obtener los params
        Bundle extras = getIntent().getExtras();
        nombre= extras.getString("nombre");
        edad = extras.getInt("edad");

        evaluacion = 2000;
        if (edad > 25) {
            evaluacion = 3000;
        }
//        else
//            evaluacion = 2000;

        txtmensaje=findViewById(R.id.txtmensaje);
        txtmensaje.setText("Buen día "+ nombre + " por su edad de " + edad +
                " podemos ofrecerle " + evaluacion + "soles");
    }
}