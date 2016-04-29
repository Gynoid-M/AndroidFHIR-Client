package com.ibis.oxygen_monitor;


import com.ibis.oxygen_monitor.Exceptions.FhirServerException;

import java.util.ArrayList;

/**
 * Created by cyber on 08/03/2016.
 */
/*
This is the Business Entity, where we manage the operations which are related with request and JSON serialization.
 */
public class FHIRClient {
    ObservationResource obResource = new ObservationResource();

    public ArrayList<Integer> requestObservationValues(){
        try {
            obResource.requestObservation();
        } catch (FhirServerException e) {
            e.printStackTrace();
        }
        return obResource.getSpo2();
    }


}
