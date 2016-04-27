package com.ibis.oxygen_monitor;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by cyber on 27/04/2016.
 */
/*
This class will be used for Login validation
 */
public class PractitionerResource extends Resource{
    public void requestPractitioner(String id){
        String request = super.request("Practitioner:"+id);


    }

}
