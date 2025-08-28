
package com.mycompany.restaurant_order_management_system;


public class Drinks extends Menu{
    public Drinks(String name, double price) {
        super(name, price,"DRINKS");
    }
    @Override
    public void display() {
        System.out.println("Name: " + name + " | Price: Rs " + price);
    }
    
}
