/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurant;

/**
 *
 * @author Asad
 */
public class Cashier extends Person{
    private double totalcash;
    Cashier(String name,String id,int age,String shifttime,double salary,double totalcash)
    {
        super(name,id,age,shifttime,salary);
        this.totalcash=totalcash;
    }
    public void generatebill(Waiter w)
    {
        System.out.println("The cashier "+name+" is generating the bill of the order of the waiter which "+w.name+" take");
    }
    @Override
    public void performduties()
    {
        System.out.println("The cashier "+name+"is taking the cash from the waiter and updating it in system");
        System.out.println("At the time of closing counting the total cash of the day and updating it in system ");
    }
    @Override
    public void displaydetails()
    {
        super.displaydetails();
         System.out.println("The total cash throughout the day is : "+totalcash);
    
    }
  
    
}
