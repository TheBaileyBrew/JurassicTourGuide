package com.thebaileybrew.jurassictourguide;

public class dinosaur {
    private final int id;
    private final String dinosaur;
    private final int dinosaurResource;
    private final String dinosaurLocation;
    private final String dinosaurClassification;
    private final String dinosaurDangerLevel;

    public dinosaur(int id, String dinosaur, int dinosaurResource, String dinosaurLocation, String dinosaurClassification, String dinosaurDangerLevel) {
        this.id = id;
        this.dinosaur = dinosaur;
        this.dinosaurResource = dinosaurResource;
        this.dinosaurLocation = dinosaurLocation;
        this.dinosaurClassification = dinosaurClassification;
        this.dinosaurDangerLevel = dinosaurDangerLevel;
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
}
