
package com.mycompany.restaurant_order_management_system;

public abstract class Menu {
    protected String name;
    protected double price;
    protected String category;

    public Menu(String name, double price,String category) {
        this.name = name;
        this.price = price;
        this.category=category;
    }

    public abstract void display();
  
}
