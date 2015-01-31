package com.example.dell.helloworld;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dell on 17/01/2015.
 */
public class MostrarFigura extends Activity {

    private TextView titulo;
    private TextView descripcion;
    Figura figura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_figura);

        Bundle bundle = getIntent().getExtras();
        figura = (Figura)getIntent().getExtras().getSerializable("figura_parametro");

        ImageView image = (ImageView) findViewById(R.id.foto1);
        image.setImageResource(figura.getFotos()[0]);

        ImageView image1 = (ImageView) findViewById(R.id.foto2);
        image1.setImageResource(figura.getFotos()[1]);

        ImageView image2 = (ImageView) findViewById(R.id.foto3);
        image2.setImageResource(figura.getFotos()[2]);

        ImageView image3 = (ImageView) findViewById(R.id.foto4);
        image3.setImageResource(figura.getFotos()[3]);

        ImageView image4 = (ImageView) findViewById(R.id.foto5);
        image4.setImageResource(figura.getFotos()[4]);
    }
}