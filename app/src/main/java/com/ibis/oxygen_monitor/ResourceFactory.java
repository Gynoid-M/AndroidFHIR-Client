package com.ibis.oxygen_monitor;

/**
 * Created by cyber on 04/05/2016.
 */
public class ResourceFactory {

    public Resource getResource(String resourceType) {
        if(resourceType == null)
        {
            return null;
        }

        if(resourceType.equals("Observation"))
        {
            return new ObservationResource();
        }
        if(resourceType.equals("Patient"))
        {
            return new PatientResource();
        }
        if(resourceType.equals("Practitioner"))
        {
            return new PractitionerResource();
        }

        return null;
    }
}
