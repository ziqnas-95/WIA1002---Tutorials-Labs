/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_tuto2_generics;

import java.util.ArrayList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Question8 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numOfCars = new ArrayList<>();
        numOfCars.add(10);
        numOfCars.add(15);
        numOfCars.add(20);
        
        ArrayList<Double> milesPerHour = new ArrayList<>();
        milesPerHour.add(10.10);
        milesPerHour.add(15.15);
        milesPerHour.add(20.20);
        
        displayList(numOfCars);
        displayList(milesPerHour);
        
        
    }
    
    public static <T> void displayList(ArrayList<T> array){
    
        System.out.println("LIST OF ELEMENTS IN THE ARRAY:");
        for (T elements : array){
            System.out.println(elements + " ");
        }
    
    }
    
    
}
