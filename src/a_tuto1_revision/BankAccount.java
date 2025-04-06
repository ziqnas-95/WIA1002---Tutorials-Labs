/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a_tuto1_revision;

/**
 *
 * @author Haziq Nasaruddin
 */

interface Account{
    int deposit(int amtD);
    boolean withdraw(int amtW);
}

public class BankAccount implements Account {
    
    public int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public int getBalance(){
        return balance;
    }
    
    @Override
    public int deposit(int amtD) {
        this.balance += amtD;
        return this.balance;
    }

    @Override
    public boolean withdraw(int amtW) {
        if (amtW <= this.balance){
            this.balance -= amtW;
            return true;
        } 
        return false;
    }
        
    public static void main(String[] args) {
        BankAccount CIMB = new BankAccount(50);
        CIMB.deposit(100);
        System.out.println(CIMB.withdraw(150));
        System.out.println(CIMB.getBalance());
    }
    
}
