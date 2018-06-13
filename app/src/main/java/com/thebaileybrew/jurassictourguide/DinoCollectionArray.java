package com.thebaileybrew.jurassictourguide;

import java.util.ArrayList;

public class DinoCollectionArray extends ArrayList {
    private ArrayList<dinosaur> Dinosaurs = new ArrayList<>();
    private ArrayList<location> Locations = new ArrayList<>();

    public ArrayList getDinosaurList() {
        Dinosaurs.add(new dinosaur(1, "Tyranosaurus Rex", R.drawable.trex, "Isla Nublar, Isla Sorna, San Diego", "Carnivore", "High"));

        return Dinosaurs;
    }

    public ArrayList getLocationList() {
        //Jurassic Park
        Locations.add(new location(1,"Locations in Jurassic Park", R.drawable.park_one_locations,"Dinosaurs", R.drawable.park_one_dinosaurs, "Important People", R.drawable.park_one_people, "Events", R.drawable.park_one_events));
        //Jurassic Park II
        Locations.add(new location(2, "Locations in Jurassic Park: TLW", R.drawable.park_two_locations, "Dinosaurs", R.drawable.park_two_dinosaurs, "Important People", R.drawable.park_two_people, "Events", R.drawable.park_two_events));
        //Jurassic Park III
        Locations.add(new location(3, "Locations in Jurassic Park III", R.drawable.park_three_locations, "Dinosaurs", R.drawable.park_three_dinosaurs, "Important People", R.drawable.park_three_people, "Events", R.drawable.park_three_events));
        //Jurassic World
        Locations.add(new location(4,"Locations in Jurassic World", R.drawable.world_locations, "Dinosaurs", R.drawable.world_dinosaurs, "Important People", R.drawable.world_people, "Events", R.drawable.world_events));


        return Locations;
    }
}
