package com.thebaileybrew.jurassictourguide;

import java.util.ArrayList;

public class DinoCollectionArray extends ArrayList {
    private ArrayList<dinosaur> Dinosaurs = new ArrayList<>();

    public ArrayList getDinosaurList() {
        Dinosaurs.add(new dinosaur(1, "Tyranosaurus Rex", R.drawable.trex, "Isla Nublar, Isla Sorna, San Diego", "Carnivore", "High"));

        return Dinosaurs;
    }

}
