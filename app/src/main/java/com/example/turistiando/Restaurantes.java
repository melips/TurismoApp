package com.example.turistiando;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#996530"));
        barra.setBackgroundDrawable(colorBarra);

        listaLogica=findViewById(R.id.recyclerRes);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        crearListaRestaurantes();
        AdaptadorRes adaptador= new AdaptadorRes(lista);
        listaLogica.setAdapter(adaptador);
    }
    public void crearListaRestaurantes(){
        lista.add(new Restaurante(R.drawable.luna,"Luna Llena","Entrada Vereda La Maria"));
        lista.add(new Restaurante(R.drawable.granjita,"La Granjita","Calle 5 #15-11"));
        lista.add(new Restaurante(R.drawable.rincon,"Rincón Antioqueño","Carrera 9 # 11-49"));
        lista.add(new Restaurante(R.drawable.rojas,"El Rancho de Rojas","Calle 5 11 05"));
    }
}