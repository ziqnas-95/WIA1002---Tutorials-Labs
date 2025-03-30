/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class CompareMax {
    
    public static void main(String[] args) {
        
        // Integer
        maximum(3,6,2);
        
        // Double
        maximum(3.9,4.6,2.2);
        
        // String
        // Character
        
    }
    
    public static <T extends Comparable<T>> void maximum(T first, T second, T third){
    
        T max = first;
        
        if(second.compareTo(max) > 0){
            max = second;
        }
        
        if(third.compareTo(max) > 0){
            max = second;
        }
    
        System.out.println("Maximum between the three values is: " + max);
    }
    
}
