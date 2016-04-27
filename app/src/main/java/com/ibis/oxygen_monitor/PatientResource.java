package com.ibis.oxygen_monitor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cyber on 07/03/2016.
 *
 */
/*
¿Qué me interesa extraer del paciente?
-Nombre, apellidos
-Foto
-Contacto
 */
public class PatientResource extends Resource{
    public void requestObservation(String id){
        String request = super.request("Patient:"+id);


    }

}
