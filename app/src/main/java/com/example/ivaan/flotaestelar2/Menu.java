package com.example.ivaan.flotaestelar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

   /* public void contacto(View v){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),Contacto.class);
        startActivity(intent);
    }*/

    public void tripulantes(View v){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),listaTripulantes.class);
        startActivity(intent);
    }

     public void bitacoras(View v){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),listaBitacoras.class);
        startActivity(intent);
    }
     public void misiones(View v){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),listaMisiones.class);
        startActivity(intent);
    }

}
