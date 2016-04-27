package com.ibis.oxygen_monitor;

import android.os.StrictMode;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cyber on 07/03/2016.
 *
 * Aquí se almacenará el objeto JSON perteneciente al recurso observación  para ser tratado a lo largo de la aplicación.
 * Sin embargo no se almacenarán todos los datos de la observación, ya que no es necesraio. Simplemente el valor y la fecha
 */

public class ObservationResource extends Resource {

    private ArrayList<Integer> spo2 = new ArrayList<>();
    private ArrayList<Date> fecha = new ArrayList<>();


    public ArrayList<Integer> getSpo2 (){
        return spo2;
    }
    public ArrayList<Date> getFecha (){
        return fecha;
    }

    public void requestObservation(){
     String request = super.request("Observation");
        try {

            JSONArray jsonRootArray = new JSONArray(request);
            for(int i = 0; i<jsonRootArray.length(); i++) {
                JSONObject jsonObservation = jsonRootArray.getJSONObject(i);

                JSONObject valueQuantity = jsonObservation.getJSONObject("valueQuantity");
                spo2.add(Integer.parseInt(valueQuantity.optString("value")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
