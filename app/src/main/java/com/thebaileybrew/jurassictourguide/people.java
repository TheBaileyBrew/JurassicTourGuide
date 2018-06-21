package com.thebaileybrew.jurassictourguide;

import android.content.res.Resources;

public class people {
    private final int id;
    private final String people;
    private final int peopleResource;
    private final String peopleLocation; //Movies Appearing
    private final String peopleClassification; //Hero, Bystander, Villain
    private final String peopleActor;
    private final String peopleDetails;
    //Default Stats


    public people(int id, String people, int peopleResource, String peopleLocation, String peopleClassification, String peopleActor, String peopleDetails) {
        this.id = id;
        this.people = people;
        this.peopleResource = peopleResource;
        this.peopleLocation = peopleLocation;
        this.peopleClassification = peopleClassification;
        this.peopleActor = peopleActor;
        this.peopleDetails = peopleDetails;

    }

    public int getId() {
        return id;
    }
    public String getPeople() {
        return people;
    }
    public int getPeopleResource() {
        return peopleResource;
    }
    public String getPeopleLocation() {
        return peopleLocation;
    }
    public String getPeopleClassification() {
        return peopleClassification;
    }
    public String getPeopleActor() {
        return peopleActor;
    }
    public String getPeopleDetails() {
        return peopleDetails;
    }



}
