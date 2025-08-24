
package com.mycompany.bankmanagementsystem;


public class Fixeddeposit extends BankAccount{
    public String type;
    private int age;
    private int months; 
    
    public Fixeddeposit(String accountnum,String accountholdername,double balance,String type,int age,int months)
    {
        super(accountnum,accountholdername,balance);
        this.type=type;
        this.age=age;
        this.months=months;
    }
    @Override
    public String getaccounttype()
    {
        return type;
    }
    @Override
    public void deposit(double amount)
    {
        System.out.println("THE DEPOSIT IS NOT ALLOWED AFTER CREATION ONE TIME DEPOSIT WHICH IS YOUR BALANCE :  "+balance);
    }
    @Override
    public void withdraw(double amount)
    {
        if(age>=18)
        {
            if(amount>0&&amount<=balance)
            {
                setbalance(balance-=amount);
                System.out.println("WITHDRWAN : "+amount);
                System.out.println("THE Total balance is :"+getbalance());   
            }
            else
            {
                System.out.println("Insuffiecient amount");
            }
        }
        else
        {
            System.out.println("Not mature ");
        }
    }
    @Override
    public double calculateInterest()
    {
        double rate=balance*0.08*(months/12.0);
        return rate;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Typen : "+type);
        System.out.println("Age : "+age);
        System.out.println("Months : "+months);
        System.out.println("Interest : "+calculateInterest());
    }
    
}
