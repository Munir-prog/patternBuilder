package com.mprog;

public class AircraftEngineer {
    private AircraftBuilder builder;
    public AircraftEngineer(AircraftBuilder builder){
        super();
        this.builder = builder;
        if (this.builder == null){
            throw new IllegalArgumentException("Aircraft Engineer can't work without Aircraft Builder!");
        }
    }

    public Aircraft manufactureAircraft(){
        return builder.repairChassis().repairWings().color().freshInterior().build();
    }

}
