/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_tuto3_adt.bags;

/**
 *
 * @author Haziq Nasaruddin
 */
public class CashRegister {
    
    /** Instance variable to store the amount of cash the machine have.
        */
    double cashOnHand;

    /** Constructors (no-argument and argument constructors)
        Getter method to get the amount of cash in hand
        */
    public CashRegister(){
        this.cashOnHand = 0;
    }
    
    public CashRegister(double amountAdded){
        this.cashOnHand = amountAdded;
    }
    
    public double getCashOnHand(){
        return cashOnHand;
    }
    
    /** Method to accept cash and return change if there are any
        */
    public double calculateChange(double amountPaid, double itemCost){
        this.cashOnHand += itemCost;
        return amountPaid-itemCost;
    }
    
    /** Method to indicate whether the amount paid is enough as compared to the item cost
        */
    public boolean isEnough(double amountPaid, double itemCost){
        return amountPaid >= itemCost;
    }
    
}
