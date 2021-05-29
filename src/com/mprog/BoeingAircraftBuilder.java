package com.mprog;

public class BoeingAircraftBuilder implements AircraftBuilder{

    private String chassis;
    private String wings;
    private String color;
    private String interior;

    public BoeingAircraftBuilder() {
        super();
    }
    @Override
    public AircraftBuilder repairChassis() {
        System.out.println("Building chassis of the Boeing model");
        this.chassis = "Boeing Chassis";
        return this;
    }

    @Override
    public AircraftBuilder repairWings() {
        System.out.println("Building wings of the Boeing model");
        this.wings = "Boeing Wings";
        return this;
    }

    @Override
    public AircraftBuilder color() {
        System.out.println("Painting aircraft of the Boeing model");
        this.color = "Boeing White Color";
        return this;
    }

    @Override
    public AircraftBuilder freshInterior() {
        System.out.println("Setting up interior of the Boeing model");
        this.interior = "Boeing interior";
        return this;
    }

    @Override
    public Aircraft build() {
        return new Aircraft(chassis, wings, color, interior);
    }
}
