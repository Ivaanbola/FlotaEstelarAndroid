package com.example.ivaan.flotaestelar2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class listaMisiones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_misiones);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tripu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.insertar:
                altaMisiones();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void altaMisiones(){
        //Toast.makeText(this, "Has hecho click en el boton", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplicationContext(),formularioMisiones.class);
        startActivity(intent);
    }



}
