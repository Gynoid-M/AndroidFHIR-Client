package com.ibis.oxygen_monitor;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

/**
 * Created by Cyberbug on 30/11/2015.
 * Aquí se crearán los gráficos de observación del paciente. Dichos datos se pedirán también conforme el estándar HL7 FHIR.
 * Habrá un filtro por fecha para que la observación sea más precisa
 */
public class ObservationGraph extends Fragment {

    FHIRClient fhir = new FHIRClient();
    ArrayList<Integer> observation = fhir.requestObservationValues();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_observacion, container, false);
        GraphView graph = (GraphView) rootView.findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(new DataPoint[] {
                //tomando como referencia el cuartil
                new DataPoint(observation.get(0), 25),
                new DataPoint(observation.get(1), 50),
                new DataPoint(observation.get(2), 75),
                new DataPoint(observation.get(3), 100)
        });
        graph.addSeries(series);


        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX() * 255 / 4, (int) Math.abs(data.getY() * 255 / 6), 100);
            }
        });

        series.setSpacing(50);

// draw values on top
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        return rootView;

    }
}
