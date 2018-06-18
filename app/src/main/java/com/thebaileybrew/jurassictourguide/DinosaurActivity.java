package com.thebaileybrew.jurassictourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DinosaurActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<dinosaur> Temp = new ArrayList<>();
    ArrayList<dinosaur> Dinosaurs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinosaur_recycler);
        Intent getFragIntent = getIntent();
        String movieSelection = getFragIntent.getStringExtra("FromMovie");

        DinoCollectionArray dinos = new DinoCollectionArray();
        Temp = dinos.getDinosaurList();
        for (dinosaur dino : Temp) {
            if (dino.getDinosaurLocation().contains(movieSelection)) {
                Dinosaurs.add(dino);
            }
        }
        Collections.sort(Dinosaurs, new Comparator<dinosaur>() {
            //This will compare and sort alphabetically the current list of Dinosaurs returned from the For Loop
            @Override
            public int compare(dinosaur d1, dinosaur d2) {
                return d1.getDinosaur().compareTo(d2.getDinosaur());
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.recycler_dinosaurs);
        recyclerView.setLayoutManager(linearLayoutManager);
        DinosaursAdapter adapter = new DinosaursAdapter(this, Dinosaurs);
        recyclerView.setAdapter(adapter);
    }
}
