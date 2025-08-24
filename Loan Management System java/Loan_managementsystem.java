

package com.mycompany.loan_managementsystem;


public class Loan_managementsystem {

    public static void main(String[] args) {
        
        System.out.println("------------CAR LOAN------------");
        Loan l=new Carloan(35000,5,50000);
        l.calmonthlyinstallment();
        Carloan c=new Carloan(35000,5,50000);
        c.display();
        System.out.println("");
        
        System.out.println("------------PERSONAL LOAN------------");
        Loan l1=new Personalloan(30000,3,1000,2000,500);
        l1.calmonthlyinstallment();
        Personalloan p=new Personalloan(30000,3,1000,2000,500);
        p.display();
        System.out.println("");
        
         System.out.println("------------HOME LOAN------------");
        Loan l3=new Homeloan(1000000,5000,3000,30,20);
        l3.calmonthlyinstallment();
        Homeloan h=new Homeloan(1000000,5000,3000,30,20);
        h.display();
        
    }
}
