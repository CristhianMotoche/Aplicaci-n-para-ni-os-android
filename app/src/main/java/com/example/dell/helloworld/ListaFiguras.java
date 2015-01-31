package com.example.dell.helloworld;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by Dell on 25/12/2014.
 */
public class ListaFiguras extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.listview);
        ListView lstFiguras = (ListView) findViewById(R.id.listaFig);

        final ArrayList<Figura> figuras = new ArrayList<Figura>();

        int fotos_cir[] = {R.drawable.fig_circulo, R.drawable.icon_flor,
                R.drawable.icon_pelota, R.drawable.icon_rueda, R.drawable.icon_sol};

        int fotos_cua[] = {R.drawable.fig_cuadrado, R.drawable.icon_casa,
                R.drawable.icon_tele, R.drawable.icon_ventana, R.drawable.icon_regalo};

        int fotos_tri[] = {R.drawable.fig_triangulo, R.drawable.icon_arbol,
                R.drawable.icon_piramide, R.drawable.icon_monte, R.drawable.icon_barco};

        figuras.add(new Figura("Círculo","Figura redonda", R.drawable.lista_circulo,fotos_cir));
        figuras.add(new Figura("Cuadrado", "Un cuadrado", R.drawable.lista_cuadrado, fotos_cua));
        figuras.add(new Figura("Triángulo", "Figura triangular", R.drawable.lista_triangulo, fotos_tri));

        AdaptadorIEC adaptador = new AdaptadorIEC(this, figuras);
        lstFiguras.setAdapter(adaptador);
        lstFiguras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListaFiguras.this, MostrarFigura.class);
                intent.putExtra("figura_parametro",figuras.get(position));
                // Acción según el item que presione
                switch (position){
                    case 0:
                    case 1:
                    case 2:
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}