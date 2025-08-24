
package com.mycompany.bankmanagementsystem;


public abstract class BankAccount {
    public String accountnum;
    private String accountholdername;
    protected double balance;
    
    BankAccount(String accountnum,String accountholdername,double balance)
    {
        this.accountnum=accountnum;
        this.accountholdername=accountholdername;
        this.balance=balance;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public double getbalance()
    {
      return balance;
    }
    public abstract double calculateInterest();
    public abstract String getaccounttype();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public void display()
    {
        System.out.println("Account number: "+accountnum);
        System.out.println("ACCOUNT HOLDER NAME : "+accountholdername);
        System.out.println(" BALANCE : "+balance);
    }
    
    
    
}
