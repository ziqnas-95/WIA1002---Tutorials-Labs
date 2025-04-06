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
 * rest jap japgi sambung balik 
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
                
        Dispenser[] snacks = new Dispenser[4];
        snacks[0] = new Dispenser("Cookies",1.50,10);
        snacks[1] = new Dispenser("Chips",1.50,10);
        snacks[2] = new Dispenser("Gum",1.50,10);
        snacks[3] = new Dispenser("Candies",1.50,10);
        
        displayItemDetails(snacks);
        
        Scanner scan = new Scanner(System.in);
        int itemSln;
        int itemQty;
        
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
    
    
    
    
    
    
}

class Dispenser {

    // instance variables
    String name;
    double price;
    int quantity;

    // operation & methods
    public Dispenser(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void addStock(int newStock){
        this.quantity += newStock;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotalPrice(int quantity){
        return price*quantity;
    }
    
    public boolean canDispense(int amount){
        return amount <= quantity;
    }
    
    public void dispenseItem(int amount){
        this.quantity -= amount;
    }
    
}

class CashRegister {
    
    // instance variables
    double cashOnHand;

    // operations & methods
    public CashRegister(){
        this.cashOnHand = 0;
    }
    
    public CashRegister(double amountAdded){
        this.cashOnHand = amountAdded;
    }
    
    public void acceptMoney(double amountPaid){
        this.cashOnHand += amountPaid;
    }
    
    public double calculateChange(double amountPaid, double itemCost){
        return amountPaid-itemCost;
    }
    
    public double getCashOnHand(){
        return cashOnHand;
    }
    
}
