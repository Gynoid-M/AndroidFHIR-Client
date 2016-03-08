package com.ibis.oxygen_monitor;

/**
 * Created by Cyberbug on 08/02/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Select extends Activity {

    ArrayList<String> pacientes;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selecionar_pacientes);

        lv = (ListView) findViewById(R.id.listView);

        //Se pretende usar conexión con el servidor del hospital en el futuro, una vez terminado el diseño perliminar
        pacientes = new ArrayList<String>();
        pacientes.add("Manuel Perez");
        pacientes.add("Samuel Zubizarreta");

        // Create an empty adapter we will use to display the loaded data.
        // We pass null for the cursor, then update it in onLoadFinished()

       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_textview,pacientes);
        lv.setAdapter(adapter);

        // Prepare the loader.  Either re-connect with an existing one,
        // or start a new one.
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(getBaseContext(),Control.class);
               startActivity(intent);

            }
        });
    }


}