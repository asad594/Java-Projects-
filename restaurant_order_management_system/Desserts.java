
package com.mycompany.restaurant_order_management_system;


public class Desserts extends Menu{
    public Desserts(String name, double price) {
        super(name, price,"DESSERTS");
    }
    @Override
    public void display() {
        System.out.println("Name: " + name + " | Price: Rs " + price);
    }
    
}
