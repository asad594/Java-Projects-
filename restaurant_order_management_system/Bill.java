
package com.mycompany.restaurant_order_management_system;
import java.util.*;
import java.io.*;

public class Bill {
    private static final String file_name="orders.csv";
    
    public void Takeorder(RestMenu menu)
    {
        Scanner input=new Scanner(System.in);
        int choice;
        int quantity;
        double total=0;
        StringBuilder ordereditems=new StringBuilder();
        System.out.println("--------Tell Me Your Order Please----------------");
        System.out.println("Enter 0 to finish the order");
        
        while(true)
        {
            System.out.println("Enter Item Number : ");
            choice=input.nextInt();
            
            if(choice==0)
            {
                break;
            }
            if(choice<1 || choice>menu.items.size())
            {
                System.out.println("No item with this number found. Check the menu again");
                continue;
            }
            System.out.println("Enter Quantity : ");
            quantity=input.nextInt();
            Menu selected=menu.items.get(choice-1);
            double grandtotal=selected.price*quantity;
            total+=grandtotal;
            ordereditems.append(quantity).append(" x ").append(selected.name)
                    .append(" = Rs ").append(grandtotal).append("\n");
            
             System.out.println(quantity + " x " + selected.name + " added. Item Total = Rs " + grandtotal);  
        }
        System.out.println("Your total for order is "+total);
        System.out.print("Enter Payment Amount: Rs ");
        double payment=input.nextDouble();
        if(payment<total)
        {
            System.out.println("Not enough money .\nTransaction failed");
            return;
        }
        else
        {
            double change=payment-total;
            System.out.println("Change : Rs "+change);
            System.out.println("Thank You For Coming! \nPlease Visit Again");
            saveOrderToCSV(ordereditems.toString(),total,payment,change);
        }
    }
    
    public void saveOrderToCSV(String order, double total,double payment,double change)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file_name, true))) 
        {
            int ordernum = getLastOrderId() + 1;
            String safeOrder = "\"" + order.replace("\n", ";") + "\""; // wrap in quotes
           bw.write("OrderID=" + ordernum + "\n");
            bw.write(order);
            bw.write("Total= Rs " + total + "\n");
            bw.write("Payment user give = Rs "+payment+"\n");
            bw.write("Change= Rs "+change+"\n\n");
            
            System.out.println("Order saved with ID=" + ordernum);
        }
        catch (IOException e) 
        {
            System.out.println("Error In Saving Data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public int getLastOrderId()
    {
        File file = new File(file_name);
        if (!file.exists()) 
        {
            return 0;
        }
        String lastOrderIdLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) 
        {
            String line;
            while ((line = br.readLine()) != null) 
            {
                if (line.startsWith("OrderID=")) 
                {
                    lastOrderIdLine = line; // keep only the latest OrderID line
                }
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        if (!lastOrderIdLine.isEmpty()) 
        {
            try 
            {
                return Integer.parseInt(lastOrderIdLine.replace("OrderID=", "").trim());
            } 
            catch (NumberFormatException e) 
            {
                return 0;
            }
        }
        return 0;
    }
   public void vieworder(int id) 
   {
       try (BufferedReader br = new BufferedReader(new FileReader(file_name))) 
       {
           String line;
           boolean found = false;
           while ((line = br.readLine()) != null) 
           {
               if (line.equals("OrderID=" + id)) 
               {
                   found = true;
                   System.out.println(line); // print OrderID line
                   while ((line = br.readLine()) != null && !line.trim().isEmpty()) 
                   {
                       System.out.println(line);
                    }
                   break;
                }
            }
           if (!found) 
           {
               System.out.println("Order not found.");
            }
        }
       catch (IOException e) 
       {
           e.printStackTrace();
        }
    }
    public void viewallorders()
    {
        try(BufferedReader br=new BufferedReader(new FileReader(file_name)))
        {
            String line;
            System.out.println("----ALL ORDERS-----");
            while((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Error reading file");
        }
    }
    public void deleteorder(int id)
    {
        File inputFile = new File(file_name);
        File tempFile = new File("temp.csv");

        boolean found = false;

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))
        ) 
        {
            String line;
            boolean skipBlock = false;
            int newOrderId = 1; 

            while ((line = br.readLine()) != null) 
            {
                if (line.startsWith("OrderID=" + id)) 
                {
                    found = true;
                    skipBlock = true;
                    continue;
                }  
                if (skipBlock && line.trim().isEmpty()) 
                {
                    skipBlock = false;
                    continue;
                }  
                if (!skipBlock) 
                {    
                    if (line.startsWith("OrderID=")) 
                    {
                        bw.write("OrderID=" + newOrderId);
                        bw.newLine();
                        newOrderId++;
                    } 
                    else 
                    {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            System.out.println("Error Writing File");
            return;
        }
        if (!inputFile.delete()) 
        {
            System.out.println("Could not delete old file");
            return;
        }
        if (!tempFile.renameTo(inputFile)) 
        {
            System.out.println("Could not rename temp file");
            return;
        }
        if (found) 
        {
            System.out.println("Order ID " + id + " deleted successfully and orders renumbered.");
        } 
        else 
        {
            System.out.println("Order not found.");
        }
    }
}
