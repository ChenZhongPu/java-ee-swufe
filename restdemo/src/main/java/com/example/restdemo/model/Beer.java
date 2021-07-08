package com.example.restdemo.model;

public class Beer {
    private String band;
    private double volume;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Beer(String band, double volume) {
        this.band = band;
        this.volume = volume;
    }
}
