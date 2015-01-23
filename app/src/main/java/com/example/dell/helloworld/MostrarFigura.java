package com.example.dell.helloworld;

import android.Manifest;
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
    private byte b[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_figura);

        Bundle bundle = getIntent().getExtras();

        titulo = (TextView) findViewById(R.id.figura_title);
        descripcion = (TextView) findViewById(R.id.descFig);
        b = bundle.getByteArray("imagen");
        Bitmap bmp = BitmapFactory.decodeByteArray(b, 0, b.length);
        ImageView image = (ImageView) findViewById(R.id.foto);
        image.setImageBitmap(bmp);

        titulo.setText(bundle.getString("titulo"));
        descripcion.setText(bundle.getString("descripcion"));
    }
}
