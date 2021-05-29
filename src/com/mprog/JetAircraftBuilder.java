package com.mprog;

public class JetAircraftBuilder implements AircraftBuilder{

    private String chassis;
    private String wings;
    private String color;
    private String interior;

    public JetAircraftBuilder() {
        super();
    }
    @Override
    public AircraftBuilder repairChassis() {
        System.out.println("Building chassis of the Jet model");
        this.chassis = "Jet Chassis";
        return this;
    }

    @Override
    public AircraftBuilder repairWings() {
        System.out.println("Building wings of the Jet model");
        this.wings = "Jet Wings";
        return this;
    }

    @Override
    public AircraftBuilder color() {
        System.out.println("Painting aircraft of the Jet model");
        this.color = "Jet Black Color";
        return this;
    }

    @Override
    public AircraftBuilder freshInterior() {
        System.out.println("Setting up interior of the Jet model");
        this.interior = "Jet interior";
        return this;
    }

    @Override
    public Aircraft build() {
        return new Aircraft(chassis, wings, color, interior);
    }
}
