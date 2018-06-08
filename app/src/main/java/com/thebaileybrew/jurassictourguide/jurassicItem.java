package com.thebaileybrew.jurassictourguide;

public class jurassicItem {

    private final String name;
    private final String classification;
    private final String dangerLevel;
    private final int dinosaurImage;

    public jurassicItem (String name, String classification, String dangerLevel, int dinosaurImage) {
        this.name = name;
        this.classification = classification;
        this.dangerLevel = dangerLevel;
        this.dinosaurImage = dinosaurImage;
    }


    public String getDinosaurName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public String getDangerLevel() {
        return dangerLevel;
    }

    public int getDinosaurImage() {
        return  dinosaurImage;
    }
}
