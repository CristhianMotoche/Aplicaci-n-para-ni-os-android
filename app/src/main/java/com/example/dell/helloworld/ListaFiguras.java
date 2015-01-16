package com.example.dell.helloworld;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Dell on 25/12/2014.
 */
public class ListaFiguras extends ActionBarActivity {

    OutputStream outStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ListView lstFiguras = (ListView) findViewById(R.id.listaFig);

        final ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Figura("Círculo","Figura redonda", getResources().getDrawable(R.drawable.abc_btn_radio_to_on_mtrl_000), null));
        figuras.add(new Figura("Cuadrado", "Un cuadrado", getResources().getDrawable(R.drawable.abc_btn_check_material), null));
        figuras.add(new Figura("Triángulo", "Figura triangular", getResources().getDrawable(R.drawable.abc_btn_check_to_on_mtrl_015), null));
        figuras.add(new Figura("Rectángulo","Figura rectangular", getResources().getDrawable(R.drawable.abc_btn_radio_material), null));

        AdaptadorIEC adaptador = new AdaptadorIEC(this, figuras);
        lstFiguras.setAdapter(adaptador);
        lstFiguras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListaFiguras.this, MostrarFigura.class);
                intent.putExtra("parametro",figuras.get(position));
                switch (position){
                    case 0:
                        startActivity(intent);
                        break;
                    case 1:
                        startActivity(intent);
                        break;
                    case 2:
                        startActivity(intent);
                        break;
                    case 3:
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}