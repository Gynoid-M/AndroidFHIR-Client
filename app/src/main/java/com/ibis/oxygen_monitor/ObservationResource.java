package com.ibis.oxygen_monitor;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cyber on 07/03/2016.
 *
 * Aquí se almacenará el objeto JSON perteneciente al recurso observación  para ser tratado a lo largo de la aplicación.
 * Sin embargo no se almacenarán todos los datos de la observación, ya que no es necesraio. Simplemente el valor y la fecha
 */

public class ObservationResource {

    private ArrayList<Integer> spo2;
    private ArrayList<Date> fecha;

    public ArrayList<Integer> getSpo2 (){
        return spo2;
    }
    public ArrayList<Date> getFecha (){
        return fecha;
    }

    public void setSpo2(Integer spo2){
        this.spo2.add(spo2);
    }


    public void setFecha (Date fecha){
        this.fecha.add(fecha);
    }


}
