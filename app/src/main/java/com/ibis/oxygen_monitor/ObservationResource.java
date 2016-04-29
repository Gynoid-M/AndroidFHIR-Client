package com.ibis.oxygen_monitor;

import com.ibis.oxygen_monitor.Exceptions.FhirServerException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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

    public void requestObservation() throws FhirServerException{
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
        if(spo2.size() == 0)
        {
            throw new FhirServerException("No se ha podido recoger los datos");
        }
    }
}
