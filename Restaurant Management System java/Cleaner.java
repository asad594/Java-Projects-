
package com.mycompany.restaurant;


public class Cleaner extends Person{
    private boolean has_sanitization_kit;
    private int cleanningroundcompleted;
    Cleaner(String name,String id,int age,String shifttime,boolean has_sanitization_kit,int cleanningroundcompleted,double salary)
    {
        super(name,id,age,shifttime,salary);
        this.has_sanitization_kit=has_sanitization_kit;
        this.cleanningroundcompleted=cleanningroundcompleted;
    }
    public void cleaningTable(Waiter w)
    {
        System.out.println("The "+name+" is cleaning the table "+w.tableassigned+" of waiter "+w.name);
    }
    public void cleanningkitchen()
    {
        System.out.println("The "+name +" is associated for cleanning the kitchen ");
    }
    @Override
    public void performduties()
    {
        if(has_sanitization_kit)
        {
            System.out.println("Sanitization kit is available.Deep cleanning will be performed");
        }
        else
        {
            System.out.println("Sanitization kit is not available.Only basic cleanning is done");
        } 
        System.out.println(cleanningroundcompleted+" Cleanning rounds completed");
    }
    @Override
    public void displaydetails()
    {
        super.displaydetails();
        
    }
            
    
}
