package com.example.ivaan.flotaestelar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class verContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_contacto);
        String asteriscos= new String();
        String nombre = getIntent().getStringExtra("nombre");
        String texto = getIntent().getStringExtra("texto");
        Integer barra = getIntent().getIntExtra("barra",0);

        TextView txtnombre = (TextView) findViewById(R.id.nombre);
        txtnombre.setText(nombre);

        TextView txttexto= (TextView) findViewById(R.id.texto);
        txttexto.setText(texto);

        for (int i = 0 ; i<barra;i++) {
            if (i%20==0) asteriscos+="\n";
            asteriscos += " * ";

        }
        TextView txtGalardones= (TextView) findViewById(R.id.galardones);
        txtGalardones.setText(asteriscos);
    }



}
