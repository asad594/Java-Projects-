

package com.mycompany.restaurant_order_management_system;
import java.util.Scanner;

public class Restaurant_Order_Management_System {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        RestMenu restaurantmenu = new RestMenu();
        System.out.println("============RESTAURANT FULL MENU==================");
        System.out.println("\n");
        restaurantmenu.additem(new BBQ("Seekh Kabab", 900));
        restaurantmenu.additem(new BBQ("Gola Kabab", 700));
        restaurantmenu.additem(new BBQ("Dhaga Kabab", 750));
        restaurantmenu.additem(new BBQ("Reshmi Kabab", 800));
        restaurantmenu.additem(new BBQ("Chicken Bihari Boti", 700));
        restaurantmenu.additem(new BBQ("Beef Bihari Boti", 900));
        restaurantmenu.additem(new BBQ("Seekh Boti", 700));
        restaurantmenu.additem(new BBQ("Chicken Malai Boti", 950));
        restaurantmenu.additem(new BBQ("Beef Malai Boti", 1050));
        restaurantmenu.additem(new BBQ("Chicken Tikka leg", 400));
        restaurantmenu.additem(new BBQ("Chicken Tikka Chest", 500));
        restaurantmenu.additem(new BBQ("Chicken Malai Tikka leg", 500));
        restaurantmenu.additem(new BBQ("Chicken Malai Tikka chest", 600));  
        restaurantmenu.additem(new BBQ("Chicken Roll", 200));
        restaurantmenu.additem(new BBQ("Chicken Mayo Roll", 250));
        restaurantmenu.additem(new BBQ("Beef Chutni Roll", 300));
        restaurantmenu.additem(new BBQ("Beef Mayo Roll", 350));
        restaurantmenu.additem(new BBQ("Chicken koila Karahi 1Kg" , 1050));
        restaurantmenu.additem(new BBQ("Chicken koila Karahi half Kg", 700));
        restaurantmenu.additem(new BBQ("Beef koila Karahi 1Kg", 1400));
        restaurantmenu.additem(new BBQ("Mutton koila Karahi 1kg", 2000));
        restaurantmenu.additem(new BBQ("Mutton koila Karahi half kg", 1000));
        restaurantmenu.additem(new BBQ("Lamb koila Karahi 1kg", 2300));
        restaurantmenu.additem(new BBQ("Lamb koila Karahi half kg", 1100));
        restaurantmenu.additem(new BBQ("Chicken Chargha Full", 1500));
        restaurantmenu.additem(new BBQ("Chicken Chargha half", 800));
        restaurantmenu.additem(new BBQ("BBQ Platter Full", 3000));
        restaurantmenu.additem(new BBQ("BBQ Platter half", 1500));
        restaurantmenu.additem(new BBQ("Grilled Fish", 850));
        restaurantmenu.additem(new BBQ("Grilled Finger Fish", 1000));
        
        restaurantmenu.additem(new FastFood("Zinger Burger", 450));
        restaurantmenu.additem(new FastFood("Chicken Burger", 350));
        restaurantmenu.additem(new FastFood("Beef Burger", 400));
        restaurantmenu.additem(new FastFood("Cheese Burger", 500));
        restaurantmenu.additem(new FastFood("Double Patty Burger", 650));
        restaurantmenu.additem(new FastFood("Chicken Sandwich", 300));
        restaurantmenu.additem(new FastFood("Club Sandwich", 500));
        restaurantmenu.additem(new FastFood("Grilled Chicken Sandwich", 450));
        restaurantmenu.additem(new FastFood("Shawarma Roll", 200));
        restaurantmenu.additem(new FastFood("Chicken Shawarma with Cheese", 300));
        restaurantmenu.additem(new FastFood("Chicken Wrap", 350));
        restaurantmenu.additem(new FastFood("Beef Wrap", 400));
        restaurantmenu.additem(new FastFood("French Fries Regular", 150));
        restaurantmenu.additem(new FastFood("French Fries Large", 200));
        restaurantmenu.additem(new FastFood("Cheese Fries", 300));
        restaurantmenu.additem(new FastFood("Loaded Fries", 400));
        restaurantmenu.additem(new FastFood("Chicken Nuggets 6 pcs", 250));
        restaurantmenu.additem(new FastFood("Chicken Nuggets 12 pcs", 450));
        restaurantmenu.additem(new FastFood("Hot Wings 6 pcs", 300));
        restaurantmenu.additem(new FastFood("Hot Wings 12 pcs", 550));
        restaurantmenu.additem(new FastFood("Fried Chicken 2 pcs", 350));
        restaurantmenu.additem(new FastFood("Fried Chicken 4 pcs", 650));
        restaurantmenu.additem(new FastFood("Chicken Pizza Small", 700));
        restaurantmenu.additem(new FastFood("Chicken Pizza Medium", 1200));
        restaurantmenu.additem(new FastFood("Chicken Pizza Large", 1800));
        restaurantmenu.additem(new FastFood("Pepperoni Pizza Small", 700));
        restaurantmenu.additem(new FastFood("Pepperoni Pizza Medium", 1300));
        restaurantmenu.additem(new FastFood("Pepperoni Pizza Large", 1800));
        restaurantmenu.additem(new FastFood("Vegetable Pizza Small", 650));
        restaurantmenu.additem(new FastFood("Vegetable Pizza Medium", 1100));
        restaurantmenu.additem(new FastFood("Vegetable Pizza Large", 1700));
        restaurantmenu.additem(new FastFood("Garlic Bread with Cheese", 300));
        
        
        restaurantmenu.additem(new Drinks("Mineral Water Small", 50));
        restaurantmenu.additem(new Drinks("Mineral Water Large", 100));
        restaurantmenu.additem(new Drinks("Soft Drink Can", 100));
        restaurantmenu.additem(new Drinks("Soft Drink 500ml", 120));
        restaurantmenu.additem(new Drinks("Soft Drink 1.5L", 180));
        restaurantmenu.additem(new Drinks("Fresh Lime Water", 120));
        restaurantmenu.additem(new Drinks("Fresh Lime Soda Sweet", 150));
        restaurantmenu.additem(new Drinks("Fresh Lime Soda Salted", 150));
        restaurantmenu.additem(new Drinks("Mint Margarita", 250));
        restaurantmenu.additem(new Drinks("Pina Colada", 300));
        restaurantmenu.additem(new Drinks("Strawberry Shake", 250));
        restaurantmenu.additem(new Drinks("Banana Shake", 200));
        restaurantmenu.additem(new Drinks("Mango Shake", 250));
        restaurantmenu.additem(new Drinks("Cold Coffee", 280));
        restaurantmenu.additem(new Drinks("Hot Coffee", 200));
        restaurantmenu.additem(new Drinks("Tea", 100));
        restaurantmenu.additem(new Drinks("Green Tea", 120));
        restaurantmenu.additem(new Drinks("Lemon Tea", 150));
        restaurantmenu.additem(new Drinks("Fresh Orange Juice", 250));
        restaurantmenu.additem(new Drinks("Apple Juice", 250));
        restaurantmenu.additem(new Drinks("Mango Shake ", 350));
        

        restaurantmenu.additem(new Desserts("Chocolate Cake Slice", 250));
        restaurantmenu.additem(new Desserts("Cheesecake Slice", 300));
        restaurantmenu.additem(new Desserts("Brownie with Ice Cream", 350));
        restaurantmenu.additem(new Desserts("Molten Lava Cake", 400));
        restaurantmenu.additem(new Desserts("Vanilla Ice Cream Single Scoop", 120));
        restaurantmenu.additem(new Desserts("Vanilla Ice Cream Double Scoop", 200));
        restaurantmenu.additem(new Desserts("Chocolate Ice Cream Single Scoop", 150));
        restaurantmenu.additem(new Desserts("Chocolate Ice Cream Double Scoop", 250));
        restaurantmenu.additem(new Desserts("Strawberry Ice Cream Single Scoop", 150));
        restaurantmenu.additem(new Desserts("Strawberry Ice Cream Double Scoop", 250));
        restaurantmenu.additem(new Desserts("Kulfi Stick", 80));
        restaurantmenu.additem(new Desserts("Falooda", 300));
        restaurantmenu.additem(new Desserts("Gulab Jamun 2 pcs", 120));
        restaurantmenu.additem(new Desserts("Gulab Jamun 4 pcs", 200));
        restaurantmenu.additem(new Desserts("Kheer Bowl", 150));
        restaurantmenu.additem(new Desserts("Shahi Tukda", 250));
        restaurantmenu.additem(new Desserts("Fruit Trifle", 300));
        restaurantmenu.additem(new Desserts("Chocolate Mousse", 280));
        restaurantmenu.additem(new Desserts("Tiramisu Slice", 350));
        restaurantmenu.additem(new Desserts("Carrot Halwa Bowl", 250));
        
        Bill bill = new Bill();
        while (true) {
            System.out.println("\n======= MAIN MENU =======");
            System.out.println("1. Give Order & Pay Bill");
            System.out.println("2. View Order by ID");
            System.out.println("3. View All Orders");
            System.out.println("4. Delete an Order");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    restaurantmenu.displayMenu();
                    bill.Takeorder(restaurantmenu);
                break;
                
                case 2:
                    System.out.print("Enter order ID: ");
                    int id = input.nextInt();
                    bill.vieworder(id);
                break;
                
                case 3:
                    bill.viewallorders();
                break;
                
                case 4:
                    System.out.print("Enter order ID to delete: ");
                    int delId = input.nextInt();
                    bill.deleteorder(delId);
                break;
                
                case 5:
                    System.out.println("Exiting...");
                    return;
                   
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
