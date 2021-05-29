package com.mprog;

public interface AircraftBuilder {
    AircraftBuilder repairChassis();
    AircraftBuilder repairWings();
    AircraftBuilder color();
    AircraftBuilder freshInterior();
    Aircraft build();
}
