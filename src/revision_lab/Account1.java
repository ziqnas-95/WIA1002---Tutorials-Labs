/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision_lab;

import java.util.ArrayList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Account1 {
    
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    // creating an arraylist for the transactions of each of the accounts created
    private ArrayList<Transaction> flow;

    public Account1(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        // initializing a new list (transactions list) for the account created 
        this.flow = new ArrayList<>();
    }

    
    // setters and getters for the instance variables
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

    public ArrayList<Transaction> getTransactions() {
        return flow;
    }
    
    public double getMonthlyInterestRate(){
        return this.annualInterestRate /12;
    }
    
    public double getMonthlyInterest(){
        return (this.balance*this.getMonthlyInterestRate()/100);
    }
    
    public void deposit(double amount){
        this.balance += amount;
        // method to add a new object to the arraylist with its parameters to initializee it.
        flow.add(new Transaction('D', amount, this.balance, "Deposit"));
    }
    
    public void withdraw(double amount){
        if (amount <= this.balance){
            this.balance -= amount;
            // method to add a new object to the arraylist with its parameters to initializee it.
            flow.add(new Transaction('W', amount, this.balance, "Withdrawal"));
        }
        else
            System.out.println("Insufficient Balance...");
    }
    
    public void printAccSummary() {
    
        System.out.println("Account Summary For : " + name);
        System.out.println("Account ID          : " + id);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.printf("Account Balance     : %.2f\n", balance);
        System.out.println("Transactions ---------");
        
        // line 94 still needs improvement on the spacing between items 
        System.out.println("Date\t\tType\tAmount\tBalance\tDescription");
        for (Transaction e : flow){
            System.out.println(e);
        }
    
    }  
    
    
    // main method to create a new account and also initializing the transaction list for the account
    public static void main(String[] args) {
        
        Account1 CIMB = new Account1("George",1122,1000);
        CIMB.setAnnualInterestRate(1.5);
        
        CIMB.deposit(30);
        CIMB.deposit(40);
        CIMB.deposit(50);
        
        CIMB.withdraw(5);
        CIMB.withdraw(4);
        CIMB.withdraw(2);
        
        CIMB.printAccSummary();
    }
    
}
