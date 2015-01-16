package com.example.dell.helloworld;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Dell on 03/01/2015.
 */
public class AdaptadorIEC extends BaseAdapter {

    // Atributos
    protected Activity activity;
    protected ArrayList<Figura> figuras;

    public AdaptadorIEC(Activity activity, ArrayList<Figura> figuras){
        this.activity = activity;
        this.figuras = figuras;
    }

    @Override
    public int getCount() {
        return figuras.size();
    }

    @Override
    public long getItemId(int position) {
        return figuras.get(position).getId();
    }


    @Override
    public Object getItem(int position) {
        return figuras.get(position);
    }

    //Método para asignar cada elemento de la lista a los datos
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View v =  convertView;

        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista_elemento, null);
        }

        Figura figura = figuras.get(position);

        TextView lblTitulo = (TextView) v.findViewById(R.id.Lb1Titulo);
        lblTitulo.setText(figura.getNombre());

        ImageView imagen = (ImageView) v.findViewById(R.id.Lb1Imagen);
        imagen.setImageDrawable(figura.getImagen());

        return v;
    }
}
