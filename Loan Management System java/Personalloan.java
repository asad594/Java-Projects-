
package com.mycompany.loan_managementsystem;


public class Personalloan extends Loan{
    private double processingfees;
    private double interestamt;
    private double insurancefee;
    Personalloan(double loanamount,int duration,double processingfees,double interestamt,double insurancefee)
    {
        super(loanamount,duration);
        this.processingfees=processingfees;
        this.interestamt=interestamt;
        this.insurancefee=insurancefee;
    }
    public double calculatetotalamt()
    {
        return loanamount+processingfees+interestamt+insurancefee;
    }
    @Override
    public void calmonthlyinstallment()
    {
        double monthlyinstallment=calculatetotalamt()/(duration*12);
        System.out.println("THE MONTHLY INSTALLMENT YOU HAVE TO PAY IS : "+monthlyinstallment);
    }
    public void display()
    {
        System.out.println("THE PROCESSING FEES IS : "+processingfees);
        System.out.println("THE INTEREST AMOUNT IS : "+interestamt);
        System.out.println("THE INSURANCE FEE IS : "+insurancefee);    
    }
    
    
}

