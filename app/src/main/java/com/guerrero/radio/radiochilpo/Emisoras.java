package com.guerrero.radio.radiochilpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Emisoras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emisoras);



        String[] estaciona = new String[] { "Kebuena",
                "Super"};

        String[] estacionaca = new String[] { "Kebuena",
                "Super"};

        ListView estacion;
        ArrayAdapter<String> adaptador;

        estacion = (ListView)findViewById(R.id.echilpo);

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,estaciona);

        estacion.setAdapter(adaptador);




        ListView estacionacap;
        ArrayAdapter<String> adaptadoraca;

        estacionacap = (ListView)findViewById(R.id.eacapulco);

        adaptadoraca = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,estacionaca);

        estacionacap.setAdapter(adaptadoraca);




        estacion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //try {
                       // Intent Song_detail = new Intent(getApplicationContext(), Emisoras.class);
                        //startActivity(Song_detail);

                        Toast.makeText(getApplicationContext(), "Hiciste click en el número " + position,
                                Toast.LENGTH_LONG).show();
                    ///}
                    //} catch (Exception e) {
                    //}
                }

            }
        });





    }
}
