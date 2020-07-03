package com.example.a4_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a4_1.adapter.PlanetAdapter;
import com.example.a4_1.model.Planet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvPlanet = findViewById(R.id.rvPlanet);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rvPlanet.setLayoutManager(manager);

        ArrayList<Planet> data =  new ArrayList<>();
        data.add(new Planet("Earth", "150 Million Km","10 N/Kg", "12750 Km"));
        data.add(new Planet("Jupiter", "778 Million Km","26 N/Kg", "143000 Km"));
        data.add(new Planet("Mars", "228 Million Km","4 N/Kg", "6800 Km"));
        data.add(new Planet("Pluto", "5900 Million Km","1 N/Kg", "2320 Km"));


        PlanetAdapter adapter = new PlanetAdapter(this, data);

        rvPlanet.setAdapter(adapter);



    }




}