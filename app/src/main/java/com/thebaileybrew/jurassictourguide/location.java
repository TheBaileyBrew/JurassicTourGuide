package com.thebaileybrew.jurassictourguide;

public class location {

    private final int id;
    private final String locationHeader;
    private final int locationHeaderImage;
    private final String locationDinosaurs;
    private final int locationDinosaurImage;
    private final String locationPeople;
    private final int locationPeopleImage;
    private final String locationEvents;
    private final int locationEventsImage;

    public location(int id, String locationHeader, int locationHeaderImage, String locationDinosaurs, int locationDinosaurImage, String locationPeople, int locationPeopleImage, String locationEvents, int locationEventsImage) {
        this.id = id;
        this.locationHeader = locationHeader;
        this.locationHeaderImage = locationHeaderImage;
        this.locationDinosaurs = locationDinosaurs;
        this.locationDinosaurImage = locationDinosaurImage;
        this.locationPeople = locationPeople;
        this.locationPeopleImage = locationPeopleImage;
        this.locationEvents = locationEvents;
        this.locationEventsImage = locationEventsImage;
    }

    public int getId() {
        return id;
    }
    public String getLocationHeader() {
        return locationHeader;
    }
    public int getLocationHeaderImage() {
        return locationHeaderImage;
    }
    public String getLocationDinosaurs() {
        return locationDinosaurs;
    }
    public int getLocationDinosaurImage() {
        return locationDinosaurImage;
    }
    public String getLocationPeople() {
        return locationPeople;
    }
    public int getLocationPeopleImage() {
        return locationPeopleImage;
    }
    public String getLocationEvents() {
        return locationEvents;
    }
    public int getLocationEventsImage() {
        return locationEventsImage;
    }
}
