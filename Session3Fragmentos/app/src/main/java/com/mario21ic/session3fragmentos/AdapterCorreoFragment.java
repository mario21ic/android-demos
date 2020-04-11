package com.mario21ic.session3fragmentos;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AdapterCorreoFragment extends RecyclerView.Adapter<AdapterCorreoFragment.ViewHolder> {

    private LayoutInflater inflador; Correo[] datos; Context micontext;

    public AdapterCorreoFragment(Context context, Correo[] datos) {
        this.datos= datos;
        micontext=context;
        inflador = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.list_item_correo, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdapterCorreoFragment.ViewHolder holder, final int i) {
        holder.titulo.setText(datos[i].getDe());
        holder.subtitutlo.setText(datos[i].getAsunto());
//        holder.itemView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(micontext, DetalleCorreo.class);
//                intent.putExtra("texto",datos[i].getTexto());
//                intent.putExtra("de",datos[i].getDe());
//                intent.putExtra("asunto",datos[i].getAsunto());
//
//                micontext.startActivity(intent);
//            }
//        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(micontext, DetalleCorreo.class);
                intent.putExtra("texto", datos[i].getTexto());
                intent.putExtra("de", datos[i].getDe());
                intent.putExtra("asunto", datos[i].getAsunto());
                boolean hayDetalle =
                        (((MainFragmentCorreo) micontext).getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
//                if (Configuration.ORIENTATION_PORTRAIT == micontext.getResources().getConfiguration().orientation)
//                    hayDetalle = false;
                Log.i("test1","clic:"+datos[i].getDe());
                Log.i("test1","valor:"+hayDetalle);
                if (hayDetalle) {
                    ((MainFragmentCorreo) micontext).mostrarDetalle(datos[i].getTexto());
                } else {
                    micontext.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitutlo;
        ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.LblDe);
            subtitutlo = (TextView)itemView.findViewById(R.id.LblAsunto);
        }
    }
}