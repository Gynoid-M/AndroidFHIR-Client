package com.ibis.oxygen_monitor;

import com.ibis.oxygen_monitor.Exceptions.FhirServerException;
import java.util.ArrayList;

/**
 * Created by cyber on 27/04/2016.
 */
public interface Resource {
    void deserializeJSON() throws FhirServerException;
    ArrayList getValues(String extension);
}
