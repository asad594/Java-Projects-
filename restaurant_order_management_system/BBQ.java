
package com.mycompany.restaurant_order_management_system;

public class BBQ extends Menu{
     public BBQ(String name, double price) {
        super(name, price,"BBQ");
    }
    @Override
    public void display() {
        System.out.println("Name: " + name + " | Price: Rs " + price);
    }
    
}
