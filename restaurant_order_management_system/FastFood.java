
package com.mycompany.restaurant_order_management_system;


public class FastFood extends Menu{
    public FastFood(String name, double price) {
        super(name, price,"FAST FOOD");
    }
    @Override
    public void display() {
        System.out.println("Name: " + name + " | Price: Rs " + price);
    }
    
}
