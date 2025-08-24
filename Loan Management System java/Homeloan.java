
package com.mycompany.loan_managementsystem;


public class Homeloan extends Loan{
    private double processingfees;
    private double insuranceamt;
    private int age;
    
    private final int retirementage=60;
    Homeloan(double loanamount,double processingfees,double insuranceamt,int age,int requestduration)
    {
        super(loanamount,0);
        this.processingfees=processingfees;
        this.insuranceamt=insuranceamt;
        this.age=age;
        this.duration=calduration(requestduration);
    }
    public int calduration(int requestduration)
    {
       int remainingyears=retirementage-age;
       int allowedduration;
       if(remainingyears<20)
       {
          allowedduration =remainingyears;
       }
       else 
       {
           allowedduration=20;
       }
       
      if (requestduration > allowedduration) {
            System.out.println("Requested duration exceeds allowed limit. Setting to " + allowedduration + " years.");
            return allowedduration;
        }
        return requestduration;
    }
    public double calculatetotalamount()
    {
        return loanamount+processingfees+insuranceamt;
    }
    @Override
    public void calmonthlyinstallment()
    {
        double monthlyinstallments=calculatetotalamount()/(duration*12);
        System.out.println("THE MONTHLY INSTALLMENTS YOU HAVE TO PAY IS : "+monthlyinstallments);
    }
    public void display()
    {
        System.out.println("THE PROCESSING FEES IS :"+processingfees);
        System.out.println("THE INSURANCE AMOUNT IS : "+insuranceamt);
        System.out.println("THE AGE IS : "+age);
        System.out.println("THE TOTAL AMOUNT IS : "+calculatetotalamount());
    }
    

    
    
}
