/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T1_revision;

/**
 *
 * @author Haziq Nasaruddin
 */
abstract class Vehicle {
    
    public double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    
    //an abstract method that can be customised by other subclasses by overriding it
    public abstract void accelerate();
    
    public double getCurrentSpeed(){
        return this.currentSpeed;
    }
    
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    //a while loop to ensure that the statement must be followed while the conditions are being met
    public void pedalToTheMetal(){
        while (this.currentSpeed < this.maxSpeed){
            accelerate();
        }
    }
    
}

/**
 *  Q: Can you create an instance of Vehicle?
 *  A: No you cannot create an instance from an abstract class.
 *     You must create another class which extends the abstract class
 *     as well as defining the accelerate method for it to work.
 * 
 */

public class Car extends Vehicle {

    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    // must provide our own implementation of the method
    public void accelerate() {
        this.currentSpeed += 5;
        System.out.println("gogogo");
        if (this.currentSpeed > this.maxSpeed){
            this.currentSpeed = this.getMaxSpeed();
        }
    }
    
    public static void main(String[] args) {
        Car kereta1 = new Car(34.5);
        kereta1.pedalToTheMetal();
        System.out.println(kereta1.getCurrentSpeed());
    }
    
}