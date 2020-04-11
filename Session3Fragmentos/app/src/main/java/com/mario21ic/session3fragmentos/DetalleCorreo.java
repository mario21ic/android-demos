package com.mario21ic.session3fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleCorreo extends AppCompatActivity {

    TextView txtvalor;
    String texto;
    String de;
    String asunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_correo);

        txtvalor = findViewById(R.id.TxtDetalle);
        Bundle datos = getIntent().getExtras();
        texto = datos.getString("texto");
        de = datos.getString("de");
        asunto = datos.getString("asunto");

        txtvalor.setText("De: " + de + " con asunto: \" " + asunto + "\" con el contenido " + texto);
    }
}
