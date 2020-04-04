package com.company;

public class Magnet {
    private String material;
    private double attractivenessDegree;

    public Magnet(String material, double attractivenessDegree) {
        this.material = material;
        this.attractivenessDegree = attractivenessDegree;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAttractivenessDegree() {
        return attractivenessDegree;
    }

    public void setAttractivenessDegree(double attractivenessDegree) {
        this.attractivenessDegree = attractivenessDegree;
    }

    public void attractsMetalObjects(double attractivenessDegree) {
        this.attractivenessDegree = attractivenessDegree;
        System.out.println("Magnet attracts iron, and its degree of attraction is: " + attractivenessDegree + " times.");
    }
}
