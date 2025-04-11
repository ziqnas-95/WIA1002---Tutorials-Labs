/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_tuto3_adt.bags;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Dispenser {
    
    /** Instance variables which includes the name, price,
        and quantity of item in the dispenser
        */
    String name;
    double price;
    int quantity;

    /** Creating the constructor, getter, and setter methods.
        */
    public Dispenser(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
    
    /** Method to add stocks of the snacks into the container
        */
    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    /** Method to state whether the amount wanted by the user can be dispensed
        depending on the quantity in the dispenser
        */
    public boolean canDispense(int amount){
        return amount <= quantity;
    }
    
    /** Method to reduce the stock of the snacks by the quantity needed*/
    public void dispenseItem(int amount){
        this.quantity -= amount;
    }
    
}
