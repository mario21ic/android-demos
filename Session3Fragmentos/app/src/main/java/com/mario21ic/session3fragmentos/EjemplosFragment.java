package com.mario21ic.session3fragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mario21ic.session3fragmentos.ejemplo1.MainActivity;

public class EjemplosFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplos_fragment);
    }

    public void ejempo1(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void ejempo2(View view) { startActivity(new Intent(this, ListaCorreo.class));

    }
}
