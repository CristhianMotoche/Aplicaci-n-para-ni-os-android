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

    OutputStream outStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.listview);
        ListView lstFiguras = (ListView) findViewById(R.id.listaFig);

        final ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Figura("Círculo","Figura redonda", R.drawable.lista_circulo, null));
        figuras.add(new Figura("Cuadrado", "Un cuadrado", R.drawable.lista_cuadrado, null));
        figuras.add(new Figura("Triángulo", "Figura triangular", R.drawable.lista_triangulo, null));
        figuras.add(new Figura("Rectángulo","Figura rectangular", R.drawable.ic_launcher, null));

        AdaptadorIEC adaptador = new AdaptadorIEC(this, figuras);
        lstFiguras.setAdapter(adaptador);
        lstFiguras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListaFiguras.this, MostrarFigura.class);
                intent.putExtra("titulo",figuras.get(position).getNombre());
                intent.putExtra("descripcion",figuras.get(position).getDescripcion());
                // Pasar imagen
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), figuras.get(position).getId_img());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                byte[] b = baos.toByteArray();
                intent.putExtra("imagen",b);
                // Acción según el item que presione
                switch (position){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}