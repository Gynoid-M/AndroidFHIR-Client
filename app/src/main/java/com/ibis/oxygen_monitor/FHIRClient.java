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
    ResourceFactory resourceFactory = new ResourceFactory();

    public ArrayList<Integer> requestObservationValues(){
        Resource resource = resourceFactory.getResource("Observation");
        try {
            resource.deserializeJSON();
        } catch (FhirServerException e) {
            e.printStackTrace();
        }
        return resource.getValues();
    }


}
