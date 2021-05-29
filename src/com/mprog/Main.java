package com.mprog;

public class Main {
    public static void main(String[] args) {
        var jetAircraftBuilder = new JetAircraftBuilder();
        var aircraftEngineer = new AircraftEngineer(jetAircraftBuilder);
        var aircraft = aircraftEngineer.manufactureAircraft();
        if (aircraft != null){
            System.out.println(aircraft);
        }
    }
}
