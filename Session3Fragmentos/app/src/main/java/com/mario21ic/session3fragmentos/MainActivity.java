package com.mario21ic.session3fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sptipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sptipo = findViewById(R.id.sptipo);
        sptipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this,(String)sptipo.getSelectedItem() , Toast.LENGTH_SHORT).show();
                Fragment FragmentoSeleccionado = null;
                switch (position) {
                    case 0:
                        FragmentoSeleccionado = new ListaFragmento();
                        break;
                    case 1:
                        FragmentoSeleccionado = new GridFragmento();
                }
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmento,FragmentoSeleccionado);
                transaction.commit();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
