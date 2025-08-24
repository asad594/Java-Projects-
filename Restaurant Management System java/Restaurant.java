

package com.mycompany.restaurant;
import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        System.out.println("*******************WAITERS IN RESTAURANT*****************");
        
        System.out.println("WAITER 1");
        Waiter w =new Waiter("ASAD","w-10",19,"morning","burger",4,true,7000);
        w.displaydetails();
        w.takeorder();
        w.serveorder();
        w.performduties();
        
        System.out.println("");
        System.out.println("WAITER 2");
        Waiter w1 =new Waiter("MAAZ","w-11",20,"EVENNING","pasta",5,true,8000);
        w1.displaydetails();
        w1.takeorder();
        w1.serveorder();
        w1.performduties();
       
        System.out.println("");
        System.out.println("WAITER 3");
        Waiter w2 =new Waiter("AMANULLAH","w-12",21,"NIGHT","HAMBURGER",6,false,9000);
        w2.displaydetails();
        w2.takeorder();
        w2.serveorder();
        w2.performduties();
        
        System.out.println("");
        System.out.println("*******************CHEFFS IN RESTAURANT*****************");
        System.out.println("CHEFF 1");
        Cheff c1=new Cheff("ABDUL HAQ","c-100",20,"morning","Pasta",22000);
        c1.displaydetails();
        c1.cookdish("burger",w);
        c1.performduties();
        
        System.out.println("");
        System.out.println("CHEFF 2");
        Cheff c2=new Cheff("SHAHBAZ","c-110",29,"EVENNING","PIZZA",25000);
        c2.displaydetails();
        c2.cookdish("pasta",w1);
        c2.performduties();
        
        System.out.println("");
        System.out.println("CHEFF 3");
        Cheff c3=new Cheff("UBAID","c-120",40,"night","Biryani",27000);
        c3.displaydetails();
        c3.cookdish("Hamburger",w2);
        c3.performduties();
        
        System.out.println("");
        System.out.println("*******************MANAGER IN RESTAURANT*****************");
        System.out.println("MANAGER 1");
        Manager m =new Manager("ARSHAD","m-1000",45,"Morning",true,12000);
        m.displaydetails();
        m.addstaff(w);
        m.addstaff(w1);
        m.addstaff(c1);
        m.addstaff(c2);
        m.performduties();
        
        System.out.println("");
        System.out.println("SENIOR MANAGER ");
        Manager m2 =new Manager("AHSAN","m-1001",55,"Evening",true,20000);
        m2.displaydetails();
        m2.addstaff(w2);
        m2.addstaff(c3); 
        m2.performduties();
        
        System.out.println("");
        System.out.println("*******************CLEANER IN RESTAURANT*****************");
        System.out.println("CLEANER 1");
        Cleaner cleaner=new Cleaner("John","cl-50",30,"Morning",true,10,3000);
        cleaner.displaydetails();
        cleaner.cleaningTable(w);
        cleaner.cleaningTable(w1);
        cleaner.performduties();
        
        System.out.println("");
        System.out.println("CLEANER 2");
        Cleaner cleaner1=new Cleaner("Paul","cl-51",29,"Evenning",true,9,4000);
        cleaner1.displaydetails();
        cleaner1.cleanningkitchen();    
        cleaner1.performduties();
        
        System.out.println("");
        System.out.println("CLEANER 3");
        Cleaner cleaner3=new Cleaner("Anna","cl-52",39,"night",false,19,5000);
        cleaner3.displaydetails();
        cleaner.cleaningTable(w2); 
        cleaner3.performduties();
        
        System.out.println("");
        System.out.println("*******************CASHIER IN RESTAURANT*****************");
        System.out.println("CASHIER 1");
        Cashier cashier=new Cashier("Hassan","cas-100",40,"morning",50000,120000);
        cashier.displaydetails();
        cashier.generatebill(w);
        cashier.generatebill(w1);
        cashier.performduties();
        
        
        System.out.println("");
        System.out.println("CASHIER 2");
        Cashier cashier1=new Cashier("Ahmed","cas-101",23,"evenning",45000,100000);
        cashier1.displaydetails();
        cashier1.generatebill(w2);
        cashier1.performduties();
        
        System.out.println("\n\n");
        Scanner input=new Scanner(System.in);
        System.out.println("Do you want to see the whole staff of Hotel ? Enter yes or no");
        String choice=input.next();
        if(choice.equals("yes"))
        {
            Management manag =new Management("KABABJEES FRIED CHICKEN ");
            manag.addstaff(w);
            manag.addstaff(w1);
            manag.addstaff(w2);
            manag.addstaff(c1);
            manag.addstaff(c2);
            manag.addstaff(c3);
            manag.addstaff(m);
            manag.addstaff(m2);
            manag.addstaff(cleaner);
            manag.addstaff(cleaner1);
            manag.addstaff(cleaner3);
            manag.addstaff(cashier);
            manag.addstaff(cashier1);
            manag.display();
            
            
        }
        else
        {
            System.out.println("Bye");
        }
        
        
        
        
    }
}
