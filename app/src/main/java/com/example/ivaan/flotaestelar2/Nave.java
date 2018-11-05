package com.example.ivaan.flotaestelar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nave);
    }

    public void contacto(View v){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),Contacto.class);
        startActivity(intent);
    }

}
