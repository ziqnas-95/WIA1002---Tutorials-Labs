/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_lab2_generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class CompareMax {
    
    public static void main(String[] args) {
        
        // Integer
        maximum(3,6,2);
        
        // Double
        maximum(3.9,4.6,8.0);
        
        // String
        // Character
        
    }
    
    /** This generic method extends the Comparable Class which can be used to implement the compareTo method
     */
    public static <T extends Comparable<T>> void maximum(T first, T second, T third){
    
        T max = first;
        
        if(second.compareTo(max) > 0)
            max = second;
        
        if(third.compareTo(max) > 0)
            max = third;
        
        System.out.println("Maximum between the three values is: " + max);
    }
    
}
