
package com.mycompany.loan_managementsystem;

public class Carloan extends Loan{
    private double price;
    
    Carloan(double loanamount,int duration,double price)
    {
        super(loanamount,duration);
        this.price=price;
      
    }
    public double calDownpayment()
    {
        return price*0.2;
    }
    public double calprocessing()
    {
        return price *0.02;
    }
    public double calinsuranceamount()
    {
        return price*0.05;
    }
    public double caltotalamount()
    {
       return price-calDownpayment()+calprocessing()+calinsuranceamount();
    }
    @Override
    public void calmonthlyinstallment()
    {
      double monthlyinstallment=(((caltotalamount()/duration)*2)-1)/12;
        System.out.println("The loan amount approved "+loanamount);
        System.out.println("The monthly installment is "+monthlyinstallment);
    }
    public void display()
    {
        System.out.println("CAR PRICE IS : "+price);
        System.out.println("THE DOWNPAYMENT IS : "+calDownpayment());
        System.out.println("THE PROCESSING FEES IS : "+calprocessing());
        System.out.println("THE INSURANCE AMOUNT IS : "+calinsuranceamount());
        System.out.println("THE TOTAL AMOUNT IS : "+caltotalamount());
        
    }
        
    
    
}
