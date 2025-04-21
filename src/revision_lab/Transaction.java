/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision_lab;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Transaction {
    
    private char type;
    private double amount;
    private double balance;
    private String desc;
    
    
    private Date dateCreated = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public String getDateCreated() {
        return sdf.format(dateCreated);
    }    
    
    
    
    public Transaction(char type, double amount, double balance, String desc) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.desc = desc;
    }
    
    //getters for the variables
    public Date getDate() {
        return dateCreated;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDesc() {
        return desc;
    }
    
    @Override
    public String toString() {
            // must refer to line 94 from Account1 to make improvement on the spacing
            String FN1 = String.format("%6.2f", amount);
            String FN2 = String.format("%.2f", balance);
            return this.getDateCreated() + "\t " + 
                    type + "\t" + 
                    FN1 + "\t" + 
                    FN2 + "\t" + 
                    desc;
    }
    
    
    
    
    
}
