/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtbags_tuto;

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
        
        // instantiate the dispensers for the snacks and the cash register to store the money
        CashRegister register1 = new CashRegister(10.50);
        Dispenser[] snacks = new Dispenser[4];
        snacks[0] = new Dispenser("Cookies",1.50,10);
        snacks[1] = new Dispenser("Chips",1.50,10);
        snacks[2] = new Dispenser("Gum",1.50,10);
        snacks[3] = new Dispenser("Candies",1.50,10);
        
        displayItemDetails(snacks);
        
        // including scanner class for input and variables to hold the user's inputs
        Scanner scan = new Scanner(System.in);
        int itemSln;
        int itemQty;
        double changeAmt;
        
        /**
         * ask user to input selection
         */
        itemSln = askForSelection(scan);
        itemQty = askForAmount(scan, snacks[itemSln]);
        changeAmt = askForPayment(scan, snacks[itemSln], itemQty, register1);
        System.out.printf("Change amount is: %.2f\n",changeAmt);
        displayItemDetails(snacks);
    }
    
    /**
     * method to show the customer the different products sold by the machine
     * @param item is the 4 different snacks created as an instance to the Dispenser Class
     */
    public static void displayItemDetails(Dispenser[] item){
        System.out.println("Code | Item    | Quantity");
        int i = 0;
        for (Dispenser items : item){
            System.out.println("[" + i + "]    " + items.getName() + "\t " + items.getQuantity());
            i++;
        }
    }
        
    public static int askForSelection(Scanner scan){
        int itemSelection;
        boolean validSelection = false;
        System.out.print("Please choose one item (Enter code of the item): ");
        itemSelection = scan.nextInt(); // include exception if the selection is not in range
        
        while (validSelection == false){
            if (itemSelection < 4 && itemSelection > -1){
                break;
            }
            System.out.print("Please reenter the item code: ");
            itemSelection = scan.nextInt();
        }
        return itemSelection;
    } // DONE 
    
    public static int askForAmount(Scanner scan, Dispenser item){
        int amtSelection;
        boolean validSelection = false;
        System.out.print("Please enter number of items: ");
        amtSelection = scan.nextInt(); // include exception if the selection is not in range
        
        while (validSelection == false){
            if (amtSelection <= item.getQuantity()){
                break;
            }
            System.out.print("Please reenter the amount of item: ");
            amtSelection = scan.nextInt();
        }
        return amtSelection;
    }
    
    public static double askForPayment(Scanner scan, Dispenser item, int quantity, CashRegister register){
        double payment;
        boolean validPayment = false;
        System.out.print("Please enter amount to pay: ");
        payment = scan.nextDouble(); // include exception if the selection is not in range
        
        while (validPayment == false){
            if (payment >= (item.getPrice()*quantity)){
                break;
            }
            System.out.print("Please reenter payment amount: ");
            payment = scan.nextDouble();
        }
        item.dispenseItem(quantity);
        return register.calculateChange(payment, item.getPrice()*quantity);
    }

}

