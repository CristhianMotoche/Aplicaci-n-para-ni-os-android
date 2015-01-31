package com.example.dell.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Dell on 29/01/2015.
 */
public class Juego extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        ImageView img = (ImageView) findViewById(R.id.foto1);
        ImageView img2 = (ImageView) findViewById(R.id.foto5);
        ImageView img3 = (ImageView) findViewById(R.id.foto3);
        ImageView img4 = (ImageView) findViewById(R.id.foto4);

        img.setOnClickListener(Juego.this);
        img2.setOnClickListener(Juego.this);
        img3.setOnClickListener(Juego.this);
        img4.setOnClickListener(Juego.this);
    }

    public void onClick(View v) {
        Toast toast;
        switch (v.getId()) {
            case R.id.foto1:
                toast = Toast.makeText(Juego.this, "Correcto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto5:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto3:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.foto4:
                toast = Toast.makeText(Juego.this, "Incorrecto", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
