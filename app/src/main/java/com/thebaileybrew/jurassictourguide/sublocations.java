package com.thebaileybrew.jurassictourguide;

public class sublocations {

    private final String sublocation; //location name
    private final String sublocationAppears; //location located
    private final int sublocationResource; //map image resource
    private final int sublocationIcon; //map icon resource
    private final String sublocationFilm; //film appearance

    public sublocations (String sublocation, String sublocationAppears, String sublocationFilm, int sublocationResource, int sublocationIcon) {
        this.sublocation = sublocation;
        this.sublocationAppears = sublocationAppears;
        this.sublocationFilm = sublocationFilm;
        this.sublocationResource = sublocationResource;
        this.sublocationIcon = sublocationIcon;
    }

    public String getSublocation() {
        return sublocation;
    }
    public String getSublocationAppears() {
        return sublocationAppears;
    }
    public String getSublocationFilm() {
        return sublocationFilm;
    }
    public int getSublocationResource() {
        return sublocationResource;
    }
    public int getSublocationIcon() {
        return sublocationIcon;
    }
}
