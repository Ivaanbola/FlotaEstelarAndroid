package com.example.ivaan.flotaestelar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    public void verContacto(View v){
        EditText nombre = (EditText) findViewById(R.id.nombre);
        String nombreTexto = nombre.getText().toString();
        SeekBar barra = (SeekBar) findViewById(R.id.barraContacto);
        Integer numBarra = barra.getProgress();
        EditText texto = (EditText) findViewById(R.id.texto);
        String textoTexto = texto.getText().toString();

       // Toast.makeText(this, "Tu nombre es "+ nombreTexto+" tu texto es "+ textoTexto+" la barra esta en la posicion " +numBarra
          //      , Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,verContacto.class);
        intent.putExtra("nombre",nombreTexto);
        intent.putExtra("texto",textoTexto);
        intent.putExtra("barra", numBarra);
        startActivity(intent);

    }



}
