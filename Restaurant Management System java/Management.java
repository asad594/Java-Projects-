
package com.mycompany.restaurant;
import java.util.ArrayList;


public class Management {
    private String name;
    ArrayList<Waiter>waiters;
    ArrayList<Cheff>cheffs;
    ArrayList<Manager>managers;
    ArrayList<Cleaner>cleaners;
    ArrayList<Cashier>cashiers;
    Management(String name)
    {
        this.name=name;
        waiters=new ArrayList<>();
        cheffs=new ArrayList<>();
        managers=new ArrayList<>();
        cleaners=new ArrayList<>();
        cashiers=new ArrayList<>();
    }
    public void addstaff(Waiter w)
    {
        waiters.add(w);
    }
    public void addstaff(Cheff c)
    {
        cheffs.add(c);
    }
    public void addstaff(Manager m )
    {
        managers.add(m);
    }
    public void addstaff(Cleaner clean )
    {
        cleaners.add(clean);
    }
    public void addstaff(Cashier cashier )
    {
        cashiers.add(cashier);
    }
    public void display()
    {
        System.out.println("NAME OF RESTAURANT : "+name );
        System.out.println("---------------------WAITERS OF RESTAURANT-----------------------------");
        for(Waiter w:waiters)
        {
            w.displaydetails();
            System.out.println("\n");
        }
        System.out.println("---------------------CHEFFS OF RESTAURANT-----------------------------");
        for(Cheff c:cheffs)
        {
            c.displaydetails();
            System.out.println("\n");
        }
        System.out.println("---------------------MANAGERS OF RESTAURANT-----------------------------");
        for(Manager m:managers)
        {
            m.displaydetails();
            System.out.println("");
        }
        System.out.println("---------------------CLEANERS OF RESTAURANT-----------------------------");
        for(Cleaner clean:cleaners)
        {
            clean.displaydetails();
            System.out.println("");
        }
        System.out.println("---------------------CAHSIERS OF RESTAURANT-----------------------------");
        for(Cashier cashier:cashiers)
        {
            cashier.displaydetails();
            System.out.println("");
        }
        
    }
    
    
}
