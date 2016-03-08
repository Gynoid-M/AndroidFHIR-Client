package com.ibis.oxygen_monitor;

import android.app.Fragment;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Cyberbug on 30/11/2015.
 *
 * El usuario tendrá acceso al historial de los pacientes. Algo que consumiremos vía HL7 FHIR.
 */
public class Historial extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_historial, container, false);
        return rootView;

    }


}