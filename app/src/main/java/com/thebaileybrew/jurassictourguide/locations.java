package com.thebaileybrew.jurassictourguide;

public class locations {

    private final String location;
    private final String locationAppears;
    private final String locationFilms;

    public locations (String location, String locationAppears, String locationFilms) {
        this.location = location;
        this.locationAppears = locationAppears;
        this.locationFilms = locationFilms;

    }

    public String getLocation() {
        return location;
    }
    public String getLocationAppears() {
        return locationAppears;
    }
    public String getLocationFilms() {
        return locationFilms;
    }

}
