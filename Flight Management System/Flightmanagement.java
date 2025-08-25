package com.mycompany.flightmanagement;

public class Flightmanagement {
    
    public static void main(String[] args) {
        System.out.println("=========FLIGHT 1========================");
     Time departure=new Time(3,10);
     Time arrival=new Time(9,10);
     
     Flight f=new Flight("PK-101","New York",departure,arrival);
     
     Passenger p=new Passenger("Asad");
     Passenger p1=new Passenger("Ali");
     Passenger p2=new Passenger("AMAN");
     Passenger p3=new Passenger("ABDULLAH");
     
     f.addpassengers(p);
     f.addpassengers(p1);
     f.addpassengers(p2);
     f.addpassengers(p3);
       
     f.printInfo();
     
     
    System.out.println("=========FLIGHT 2========================");
 
     Time departure1=new Time(1,45);
     Time arrival1=new Time(10,00);
     
     Flight f1=new Flight("SA-990","Saudia Arabia",departure1,arrival1);
     
     Passenger p4=new Passenger("AHMED");
     Passenger p5=new Passenger("UBAID");
     Passenger p6=new Passenger("JUNAID");
     Passenger p7=new Passenger("WAQAS");
     Passenger p8=new Passenger("SHAHBAZ");
     
     f1.addpassengers(p4);
     f1.addpassengers(p5);
     f1.addpassengers(p6);
     f1.addpassengers(p7);
     f1.addpassengers(p8);
        
     f1.printInfo();
    }
}
