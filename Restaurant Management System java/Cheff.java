
package com.mycompany.restaurant;

public class Cheff extends Person{
    private String speciality;
   
    Cheff(String name,String id,int age,String shifttime,String speciality,double salary)
    {
        super(name,id,age,shifttime,salary);
        this.speciality=speciality;
    }
    public void cookdish(String dishname,Waiter w)
    {
        System.out.println("Cheff "+name +" is Preparing the dish " +dishname+" which the waiter "+w.name+" gave ");
    }
    
    @Override
    public void performduties()
    {
        System.out.println("Cheff "+name +" is performing there duties listenning the order from waiter and then preparing it ");
    }
    @Override
    public void displaydetails()
    {
        super.displaydetails();
        System.out.println("SPECIALITY : "+speciality);
        
    }
    
    
}
