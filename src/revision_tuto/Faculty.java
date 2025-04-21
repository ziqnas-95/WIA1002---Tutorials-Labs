/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision_tuto;

/**
 *
 * @author Haziq Nasaruddin
 */

class Person {    
    public Person(){
        System.out.println("(1) Performs Person's tasks");
    }
}

class Employee extends Person {
    public Employee(){
        // this calls the arg-constructor with the String argument
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks");
    }
    
    // constructor overloading
    public Employee(String s){
        System.out.println(s);
    }
    
}

public class Faculty extends Employee{
    public Faculty(){
        System.out.println("(4) Performs Faculty's tasks");
    }
    
    public static void main(String[] args) {
        // this line is creating a new instance of the Faculty Class, also invoking the constructor of Faculty
        new Faculty();
    }

}

/**
 *  The program will print all the statements under all of the classes
 *  The Faculty class extends both Employee and Person classes causing
 *  all the statements created in the constructor are being called
 * 
 *  This is a form of inheritance with Parent and Child Class
 * 
 */


