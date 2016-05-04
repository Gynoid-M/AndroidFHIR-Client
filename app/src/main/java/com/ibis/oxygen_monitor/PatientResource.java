package com.ibis.oxygen_monitor;

import com.ibis.oxygen_monitor.Exceptions.FhirServerException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

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
public class PatientResource implements Resource{
    @Override
    public void deserializeJSON() throws FhirServerException {

    }

    @Override
    public ArrayList getValues() {
        return null;
    }

}
