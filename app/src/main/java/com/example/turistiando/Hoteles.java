package com.example.turistiando;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    //Atributos de la clase
    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#996530"));
        barra.setBackgroundDrawable(colorBarra);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        crearListaHoteles();
        Adaptador adaptador= new Adaptador(lista);
        listaLogica.setAdapter(adaptador);
    }
    public void crearListaHoteles(){
        lista.add(new Hotel(R.drawable.encantol,"Encanto de Luna","$150000 COP"));
        lista.add(new Hotel(R.drawable.fincanaya,"Finca Naya","$230000 COP"));
        lista.add(new Hotel(R.drawable.fincacajaoro,"Finca Caja de Oro","$210000 COP"));
        lista.add(new Hotel(R.drawable.jardinsecreto,"Jardin Secreto","$360000 COP"));
    }

}

