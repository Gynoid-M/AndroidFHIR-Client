package com.ibis.oxygen_monitor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Cyberbug on 30/11/2015.
 */
public class Ficha extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_ficha, container, false);

        ImageView image = (ImageView) rootView.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.icon_profile);

        return rootView;

    }
}
