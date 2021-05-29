package com.mprog;

public class CargoAircraftBuilder implements AircraftBuilder{

    private String chassis;
    private String wings;
    private String color;
    private String interior;

    public CargoAircraftBuilder() {
        super();
    }
    @Override
    public AircraftBuilder repairChassis() {
        System.out.println("Building chassis of the Cargo model");
        this.chassis = "Cargo Chassis";
        return this;
    }

    @Override
    public AircraftBuilder repairWings() {
        System.out.println("Building wings of the Cargo model");
        this.wings = "Cargo Wings";
        return this;
    }

    @Override
    public AircraftBuilder color() {
        System.out.println("Painting aircraft of the Cargo model");
        this.color = "Cargo Dark Color";
        return this;
    }

    @Override
    public AircraftBuilder freshInterior() {
        System.out.println("Setting up interior of the Cargo model");
        this.interior = "Cargo interior";
        return this;
    }

    @Override
    public Aircraft build() {
        return new Aircraft(chassis, wings, color, interior);
    }
}
