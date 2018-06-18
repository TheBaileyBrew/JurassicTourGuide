package com.thebaileybrew.jurassictourguide;

import android.content.res.Resources;

public class dinosaur {
    private final int id;
    private final String dinosaur;
    private final int dinosaurResource;
    private final String dinosaurLocation;
    private final String dinosaurClassification;
    private final String dinosaurDangerLevel;
    private final String dinosaurDetails;
    //Default Stats
    private final String dinoHeight;
    private final String dinoWeight;
    private final String dinoDiscovered;

    public dinosaur(int id, String dinosaur, int dinosaurResource, String dinosaurLocation, String dinosaurClassification, String dinosaurDangerLevel, String dinosaurDetails, String dinoHeight, String dinoWeight, String dinoDiscovered) {
        this.id = id;
        this.dinosaur = dinosaur;
        this.dinosaurResource = dinosaurResource;
        this.dinosaurLocation = dinosaurLocation;
        this.dinosaurClassification = dinosaurClassification;
        this.dinosaurDangerLevel = dinosaurDangerLevel;
        this.dinosaurDetails = dinosaurDetails;
        this.dinoHeight = dinoHeight;
        this.dinoWeight = dinoWeight;
        this.dinoDiscovered = dinoDiscovered;
    }

    public int getId() {
        return id;
    }
    public String getDinosaur() {
        return dinosaur;
    }
    public int getDinosaurResource() {
        return dinosaurResource;
    }
    public String getDinosaurLocation() {
        return dinosaurLocation;
    }
    public String getDinosaurClassification() {
        return dinosaurClassification;
    }
    public String getDinosaurDangerLevel() {
        return dinosaurDangerLevel;
    }
    public String getDinosaurDetails() {
        return dinosaurDetails;
    }
    public String getDinoHeight() {
        return dinoHeight;
    }
    public String getDinoWeight() {
        return dinoWeight;
    }
    public String getDinoDiscovered() {
        return dinoDiscovered;
    }


}
