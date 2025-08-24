
package com.mycompany.restaurant;


public abstract class Person {
    protected String name;
    protected String id;
    private int age;
    protected String shifttime;
    protected double salary;
    Person(String name,String id,int age,String shifttime,double salary)
    {
     this.name=name;
     this.id=id;
     this.age=age;
     this.shifttime=shifttime;
     this.salary=salary;
    }
    public abstract void performduties();
    public void displaydetails()
    {
        System.out.println("NAME : "+name);
        System.out.println("ID : "+id);
        System.out.println("AGE : "+age);
        System.out.println("SHIFT TIME : "+shifttime);
        System.out.println("SALARY : $"+salary);
    }
    
    
    
            
}

