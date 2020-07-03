package com.example.a4_1.model;

public class Planet {
    private String name;
    private String distance;
    private String gravity;
    private String diameter;

    public Planet(String name, String distance, String gravity, String diameter) {
        this.name = name;
        this.distance = distance;
        this.gravity = gravity;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
}
