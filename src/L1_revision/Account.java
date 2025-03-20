/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1_revision;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Haziq Nasaruddin
 */


public class Account {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return sdf.format(dateCreated);
    }
    
    public double getMonthlyInterestRate(){
        return this.annualInterestRate /12;
    }
    
    public double getMonthlyInterest(){
        return (this.balance*this.getMonthlyInterestRate()/100);
    }
    
    public String deposit(double amt){
        this.balance += amt;
        return "Deposit amount of " + amt + " is successful...";
    }
    
    public String withdraw(double amt){
        if (amt <= this.balance){
            this.balance -= amt;
            return "Withdraw amount of " + amt + " is successful...";
        }
        else
            return "Withdraw amount of " + amt + " is unsuccessful. Insufficient balance...";
    }
    
    public static void main(String[] args) {
        
        Account CIMB = new Account(1122,20000);
        CIMB.setAnnualInterestRate(4.5);
        CIMB.withdraw(2500);
        CIMB.deposit(3000);
        
        System.out.printf("Balance:\t%.2f",CIMB.getBalance());                  System.out.println("");
        System.out.printf("Mthly Interest:\t%.2f",CIMB.getMonthlyInterest());   System.out.println("");
        System.out.printf("Date Created:\t%s",CIMB.getDateCreated());           System.out.println("");
    }
}
