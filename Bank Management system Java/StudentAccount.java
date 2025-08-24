
package com.mycompany.bankmanagementsystem;


public class StudentAccount extends BankAccount{
    private int overdraftlimit;
    private String type;
    StudentAccount(String accountnum,String accountholdername,double balance ,String type,int overdraftlimit)
    {
        super(accountnum,accountholdername,balance);
        this.type=type;
        this.overdraftlimit=overdraftlimit;
    }
    @Override
    public String getaccounttype()
    {
        return type;
    }
    @Override
    public void deposit(double amount)
    {
        setbalance(balance+=amount);
        System.out.println("DEPOSITED : "+amount);
        System.out.println("The total balance is :"+getbalance());
    }
    @Override
    public void withdraw(double amount)
    {
        if(amount>0&& amount<=balance+overdraftlimit)
        {
            setbalance(balance-=amount);
            System.out.println("Withdrawn : "+amount);
            System.out.println("The total balance is : "+getbalance());
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    @Override
    public double calculateInterest()
    {
        double rate =getbalance()*0.03;
        return rate;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Overdraftlimit: "+overdraftlimit);
        System.out.println("Type : "+type);
        System.out.println("Interest : "+calculateInterest());
    }
}
