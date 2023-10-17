/*
 * Marcos Valencia
 * 10/16/2023
 * CoffeeShop.java
 * This program is meant to ask user for information, 
 * ask user to order the items they want from the coffee shop, 
 * then edit a txt file to be the reciept for the customer.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class CoffeeShop 
{
    public static void main(String[] args)
    {
        /*Declare the variables and make an Array List to keep track of the items selected */
        int numOfItemsOrdered;
        int choice=0;
        int quit = 999;
        String phone;
        double totalPrice = 0.00;
        ArrayList<String> order = new ArrayList<String>();
        String name;
        Scanner kb = new Scanner(System.in);
        /*Ask the user for personal info and accept it */
        System.out.println("Hello welcome to Valencia's Coffee Shop");
        System.out.println("Enter your name: ");
        name = kb.nextLine();
        System.out.println("Enter your phone number: ");
        phone = kb.nextLine();
        /*Create class objects needed */
        Customer myCustomer = new Customer(name, phone);
        Cold myCold = new Cold();
        Hot myHot = new Hot();
        cookies myCookies = new cookies();
        muffin myMuffin = new muffin();
        try
        {
            /*Loop for user to pick however many items they want and let them exit by typing 999 */
            while(choice != quit)
            {
                System.out.println("\nEnter 1 for muffin options, 2 for Cookies, 3 for cold options, and 4 for hot options or enter 999 to quit");
                choice = kb.nextInt();
                /* loop so that the user is taken to the part of the menu that they want to see */
                if(choice == 1)
                {
                   
                    System.out.println("The price for each muffin is $5.99\n");
                    myMuffin.setMuffin();
                    order.add(myMuffin.getMuffin());
                    totalPrice = totalPrice + 5.99;
                
                }   
                else if(choice ==2)
                {
                    System.out.println("The price for each cookie is $1.99\n");
                    myCookies.setCookies();
                    order.add(myCookies.getCookies());
                    totalPrice = totalPrice + 1.99;
                }
                else if(choice ==3)
                {
                    System.out.println("The price for each cold option is $7.99");
                    myCold.setColdOptions();
                    order.add(myCold.getCold());
                    totalPrice = totalPrice +7.99;
                }
                else if(choice == 4)
                {
                    System.out.println("The price for each hot option is $6.99");
                    myHot.setHotOptions();
                    order.add(myHot.getHot());
                    totalPrice = totalPrice+6.99;
                }
                else if(choice == quit)
                    break;
                else
                    throw new ArithmeticException("Ivalid Option");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.");
        }
        /*use function size() to see how many items were ordered by the user */
        numOfItemsOrdered = order.size();
        double tax = totalPrice *0.08;
        double totalAfterTax = totalPrice - tax;

        /*Creaet JFrame to ask user if they want recipt */
        kb.nextLine();
        JFrameReceipt aFrame = new JFrameReceipt();
        final int width = 350;
        final int height = 150;
        aFrame.setSize(width, height);
        aFrame.setVisible(true);
        /*Write in the Reciept.txt file */
        try
        {
            FileWriter myWriter = new FileWriter("Reciept.txt");
            myWriter.write(myCustomer.display());
            myWriter.write("\n" + order);
            myWriter.write("\nNumber Of Items Ordered: " + numOfItemsOrdered);
            myWriter.write("\ntotal price befor tax: $" + totalPrice +"\nTax at %8: $" +tax + "\nTotal After Tax: $"+totalAfterTax);
            myWriter.close();
        }  
        catch(IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        System.out.println("Thank you for your order");
    }
    
}
