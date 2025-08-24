
package com.mycompany.bankmanagementsystem;


public class Savingaccount extends BankAccount{
    private String type;
    Savingaccount(String accountnum,String accountholdername,double balance,String type)
    {
      super(accountnum,accountholdername,balance);  
        this.type=type;
    }
    @Override
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Deposited : "+amount);
        System.out.println("The total balance is : "+balance);
    }
    @Override
    public void withdraw(double amount)
    {
     if(amount>0&&amount<=balance)
     {
         balance-=amount;
         System.out.println("Withdrawn : "+amount);
         System.out.println("The total balance is : "+balance);
     }
     else
     {
         System.out.println("INSUFFICIENT AMOUNT");
     }
    }
    @Override
    public String getaccounttype()
    {
        return type;
    }
    @Override
    public double calculateInterest()
    {
        double rate=getbalance()*0.05;
        return rate;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Account type : "+type);
        System.out.println("Interest : "+calculateInterest());
    }
    
}
