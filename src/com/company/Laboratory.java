package com.company;

public class Laboratory {
    private Microscope microscope;
    private Magnet magnet;
    private String glassType;

    public Laboratory(Microscope microscope, Magnet magnet, String glassType) {
        this.microscope = microscope;
        this.magnet = magnet;
        this.glassType = glassType;
    }

    public Microscope getMicroscope() {
        return microscope;
    }

    public void setMicroscope(Microscope microscope) {
        this.microscope = microscope;
    }

    public Magnet getMagnet() {
        return magnet;
    }

    public void setMagnet(Magnet magnet) {
        this.magnet = magnet;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public void laboratoryWorkingHours() {
        System.out.println("You can work in the laboratory from 9 am to 6 pm.");
    }
}
