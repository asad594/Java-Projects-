
package com.mycompany.bankmanagementsystem;


public class Currentaccount extends BankAccount{
    private String type;
    Currentaccount(String accountnum,String accountholdername,double balance,String type)
    {
        super(accountnum,accountholdername,balance);
        this.type=type;
    }
    public String getaccounttype()
    {
        return type;
    }
    public void deposit(double amount)
    {
        setbalance(balance+=amount);
        System.out.println("Deposited : "+amount);
        System.out.println("The total balance is : "+getbalance());
    }
    public void withdraw(double amount)
    {
        if(amount>0&&amount<=balance)
     {
         setbalance(balance-=amount);
         System.out.println("Withdrawn : "+amount);
         System.out.println("The total balance is : "+getbalance());
     }
     else
     {
         System.out.println("INSUFFICIENT AMOUNT");
     }
    }
    @Override
    public double calculateInterest()
    {
        return 0;
    }
    public void deductfee()
    {
        if(getbalance()>1000)
        {
            setbalance(getbalance()-100);
            System.out.println("Balance after deducting fee is : "+getbalance());
        }
        else
        {
            System.out.println("Balance is less than 1000");
        }
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Type : "+type);
        System.out.println("There is no interest in this type of account : "+calculateInterest());
    }
}
