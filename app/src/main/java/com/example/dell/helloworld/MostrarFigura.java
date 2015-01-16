package com.example.dell.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Dell on 10/01/2015.
 */
public class MostrarFigura extends Activity{
    TextView tx = (TextView) findViewById(R.id.figura_title);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figura);//Mostramos el layout activity_figura.xml
        Figura fig = (Figura) getIntent().getExtras().getParcelable("parametro");
        if(tx == null){
            System.exit(1);
        }
        tx.setText(fig.getNombre());
    }
}
