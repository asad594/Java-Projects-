
package com.mycompany.restaurant;

public class Waiter extends Person {
    protected int tableassigned;
    private boolean isavailable;
    protected String order;
    Waiter(String name,String id,int age,String shifttime,String porder,int tableassigned,boolean isavailable,double salary)
    {
        super(name,id,age,shifttime,salary);
        this.order=order;
        this.tableassigned=tableassigned;
        this.isavailable=isavailable;
        
    }
    public void takeorder()
    {
        if(isavailable==true)
        {
            System.out.println("Taking the order of :  "+order+" from the table "+tableassigned);
        }
        else
        {
            System.out.println("Waiter is not available");
        }   
    }
    public void serveorder()
    {
        if(isavailable==true)
        {
             System.out.println("Serving the order to the table "+tableassigned);
        }
        else
        {
            System.out.println("Waiter with id "+id+" is not available ");
        }
        
    }
    @Override
    public void performduties()
    {
        if(isavailable==true)
        {
            System.out.println("The waiter "+name+" is performing there duties taking and serving the order");
        }
        else
        {
            System.out.println("The waiter with id " +id+" is absent today");
        }
        
    }
    @Override
    public void displaydetails()
    {
        
        super.displaydetails();
        System.out.println("TABLE ASSIGNED : "+tableassigned);
        System.out.println("IS AVAILABLE : "+isavailable);
    }
    
}
