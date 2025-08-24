
package com.mycompany.restaurant;
import java.util.*;

public class Manager extends Person{
    private int totalstaffsupervised;
    private boolean isonduty;
    public ArrayList<Person> stafflist;
    
    Manager(String name,String id,int age,String shifttime,boolean isonduty,double salary)
    {
        super(name,id,age,shifttime,salary);
        this.stafflist=new ArrayList<>();
        this.totalstaffsupervised=0;
        this.isonduty=isonduty;
    }
    public void addstaff(Person p)
    {
        stafflist.add(p);
        totalstaffsupervised++;        
    }
    @Override
    public void performduties()
    {
        if(isonduty==true)
        {
            System.out.println("MANAGER "+name+" is supervising the following staff");
            for(Person p:stafflist)
            {
                System.out.println("");
                p.displaydetails();
            }
        }
        else
        {
            System.out.println("MANAGER IS ABSENT");
        }
    }
    @Override
    public void displaydetails()
    {
        super.displaydetails();
        System.out.println("(Total staff supervised : )"+totalstaffsupervised);
        System.out.println("IS ON DUTY : "+isonduty);
        
    }
}
