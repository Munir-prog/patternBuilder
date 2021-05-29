package com.mprog;

public class Aircraft {

    private String chassis;
    private String wings;
    private String color;
    private String interior;


    public Aircraft(){
        super();
    }

    public Aircraft(String chassis, String wings, String color, String interior){
        this();
        this.chassis = chassis;
        this.wings = wings;
        this.color = color;
        this.interior = interior;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getWings() {
        return wings;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Aircraft [chassis=" + chassis + ", wings=" + wings + ", color=" + color;
    }
}
