
package com.mycompany.restaurant_order_management_system;

import java.util.ArrayList;
import java.util.List;


public class RestMenu {
    private int index = 1;
    public List<Menu> items;

    public RestMenu() {
        items = new ArrayList<>();
    }

    public void additem(Menu m) {
        items.add(m);
    }

    public void displayMenu() 
    {
        System.out.println("========= RESTAURANT MENU =========");

        int n = 1; 
        n = printCategory("BBQ", n);
        n = printCategory("FAST FOOD", n);
        n = printCategory("DRINKS", n);
        n = printCategory("DESSERTS", n);
    }

    private int printCategory(String cat, int start) 
    {
        System.out.println("\n--- " + cat + " ---");
        int n = start;
        for (Menu m : items) 
        {
            if (m.category.equals(cat)) 
            {
                System.out.print(n + ". ");
                m.display();
                n++;
            }
        }
        return n;
    } 
}
