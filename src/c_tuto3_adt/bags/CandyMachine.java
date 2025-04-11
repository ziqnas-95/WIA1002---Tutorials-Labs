/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_tuto3_adt.bags;

import java.util.Scanner;

/**
 *
 * @author Haziq Nasaruddin
 * 
 * 
 */
public class CandyMachine {
    /**
     * main program method to create the objects from both Dispenser and cashRegister
     * 
     * include input function to allow the user to choose what they want
     * 
     * @param args 
     */
    public static void main(String[] args) {
        
        CashRegister register1 = new CashRegister(10.50);
        Dispenser[] snacks = new Dispenser[4];
        snacks[0] = new Dispenser("Cookies",1.50,10);
        snacks[1] = new Dispenser("Chips",1.50,10);
        snacks[2] = new Dispenser("Gum",1.50,10);
        snacks[3] = new Dispenser("Candies",1.50,10);
        
        displayItemDetails(snacks);
        
        Scanner scan = new Scanner(System.in);
        int itemSln;
        int itemQty;
        double amtPaid;
        
        /**
         * ask user to input selection
         */
        System.out.print("Please choose one item (Enter code of the item): ");
        itemSln = scan.nextInt();
        System.out.print("Quantity: ");
        itemQty = scan.nextInt();
        
        while (snacks[itemSln].canDispense(itemQty) == false){
            System.out.println(snacks[itemSln].getQuantity() + " is in stock");
            System.out.print("Reenter quantity:");
            itemQty = scan.nextInt();
        }
        
        System.out.println("Insert amount of money to be paid: ");
        amtPaid = scan.nextDouble();
        
        while (register1.isEnough(amtPaid, (snacks[itemSln].getPrice()*itemQty)) == false){
            System.out.print("Reenter amount of money:");
            amtPaid = scan.nextInt();
        }
        
        snacks[itemSln].dispenseItem(itemQty);
        System.out.println("Money change : " + register1.calculateChange(amtPaid, snacks[itemSln].getPrice()*itemQty));  
        

    }
    
    /**
     * show the customer the different products sold by the machine
     * @param item is the 4 different snacks created as an instance to the Dispenser Class
     */
    public static void displayItemDetails(Dispenser[] item){
        System.out.println("Code | Item");
        int i = 0;
        for (Dispenser items : item){
            System.out.println("[" + i + "]    " + items.getName());
            i++;
        }
    }
    
    /** Methods:
        (1) Showing the customer the different products sold by the candy machine | Iterating through the array and 
        (2) Let the customer make the selection
        (3) Show the customer the cost of the item selected
        (4) Accept money from the customer
        (5) Return the change
        (6) Releasing the item
        */
    
}

