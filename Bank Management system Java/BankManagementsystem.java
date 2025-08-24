
package com.mycompany.bankmanagementsystem;
import java.util.Scanner;

public class BankManagementsystem {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the type of account");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        System.out.println("3.Fixed Deposit Account");
        System.out.println("4.Student Account");
        int choice =input.nextInt();
        
        switch(choice)
        {
            case 1: 
                System.out.println("----------------SAVINGS ACCOUNT--------");
                BankAccount b=new Savingaccount("A1-1023","ASAD",12000,"Saving Account");
                b.display();
                b.deposit(2000);
                b.withdraw(10000);
                b.calculateInterest();
                System.out.println("");
                b.display();
            break;
            
            case 2:
                System.out.println("----------------CURRENT ACCOUNT--------");
                Currentaccount a1=new Currentaccount("A1-1024","ABDULLAH",16000,"CURRENT Account");
                a1.deductfee();
                BankAccount b1=new Currentaccount("A1-1024","ABDULLAH",16000,"CURRENT Account");
                b1.display();
                b1.deposit(4000);
                b1.withdraw(10000);
                b1.calculateInterest();
                System.out.println("");
                b1.display();
            break;
            
            case 3: 
                System.out.println("----------------FIXED DEPOSIT ACCOUNT--------");
                BankAccount b3=new Fixeddeposit("A1-1023","ASAD",20000,"Fixed Depoist Account",18,6);
                b3.display();
                b3.deposit(2000);
                b3.withdraw(10000);
                b3.calculateInterest();
                System.out.println("");
                b3.display();
            break;
            
            case 4: 
                System.out.println("----------------SAVINGS ACCOUNT--------");
                BankAccount b4=new StudentAccount("A1-1023","ASAD",12000,"Student Account",500);
                b4.display();
                b4.deposit(2000);
                b4.withdraw(10000);
                b4.calculateInterest();
                System.out.println("");
                b4.display();
            break;
            
            default:
                System.out.println("Invalid input");
                break;
            
        }
        
        
    }
}
