package com.ibis.oxygen_monitor;

import com.ibis.oxygen_monitor.Exceptions.FhirServerException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by cyber on 27/04/2016.
 */
/*
This class will be used for Login validation
 */
public class PractitionerResource implements Resource{


    @Override
    public void deserializeJSON() throws FhirServerException {

    }

    @Override
    public ArrayList getValues() {
        return null;
    }
}
