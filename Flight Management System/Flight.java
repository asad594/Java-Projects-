package com.mycompany.flightmanagement;

import java.util.ArrayList;

public class Flight {
    private String id;
    private String destination;
    private Time departure;
    private Time arrival;
    private ArrayList<Passenger> passengersList;
    
    Flight(String id,String destination,Time departure,Time arrival)
    {
        this.id=id;
        this.destination=destination;
        this.departure=departure;
        this.arrival=arrival;
        this.passengersList=new ArrayList<>();
    }
    public void addpassengers(Passenger p)
    {
        passengersList.add(p);
    }
    public void printInfo() {
        System.out.println("Flight no : " + id);
        System.out.println("Destination : " + destination);
        System.out.println("Departure : " + departure);
        System.out.println("Arrival : " + arrival);
        System.out.println("Number of passenger : " + passengersList.size());
        System.out.println("-----------------PASSENGERS NAMES-----------");
        for (Passenger p : passengersList) {
        System.out.println(".->" + p.getname());
    }

    }
    
}
