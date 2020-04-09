package com.mario21ic.session1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MiSpinner extends AppCompatActivity {
    Spinner mispinner;
    String miitem;
    EditText edtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mi_spinner);
        mispinner=findViewById(R.id.spAnimals);
        edtDescripcion=findViewById(R.id.etDescription);
        mispinner
                .setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0,
                                               View arg1, int position, long arg3) {
            // TODO Auto-generated method stub
                        miitem = (String) mispinner.getSelectedItem();
                        if (edtDescripcion.getText().length()>0) {
                            edtDescripcion.setText(edtDescripcion.getText() + " ," + miitem);
                        } else {
                                edtDescripcion.setText(miitem);
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub
                    }
                });
    }
}