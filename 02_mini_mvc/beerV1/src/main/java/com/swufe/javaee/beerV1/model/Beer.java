package com.swufe.javaee.beerV1.model;

public class Beer {
    private String band;
    private double size;

    public Beer(String band, double size) {
        this.band = band;
        this.size = size;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", size=" + size +
                '}';
    }
}
