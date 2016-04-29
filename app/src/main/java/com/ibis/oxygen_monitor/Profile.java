package com.ibis.oxygen_monitor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cyberbug on 30/11/2015.
 */
public class Profile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ficha, container, false);

        ImageView image = (ImageView) rootView.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.icon_profile);
        TextView nombrePaciente = (TextView)rootView.findViewById(R.id.nombrePaciente);
        TextView edadPaciente = (TextView)rootView.findViewById(R.id.edadPaciente);
        TextView contacto = (TextView)rootView.findViewById(R.id.contacto);
        nombrePaciente.setText("Juan Jiménez");
        edadPaciente.setText("Edad: 75");
        contacto.setText("Teléfono de contacto: 966666666");

        return rootView;

    }
}
