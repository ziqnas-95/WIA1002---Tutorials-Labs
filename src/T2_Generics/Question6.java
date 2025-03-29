/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Question6 {
    
    public static void main(String[] args) {
        
        Duo<String,Integer> sideShape = new Duo("Haziq",20); 
        System.out.println("SS: " + sideShape.getFirst());
        System.out.println("SS: " + sideShape.getSecond());
        
        Duo<Double,Double> points = new Duo(25.6,26.5);
        System.out.println("P: " + points.getFirst());
        System.out.println("P: " + points.getSecond());
        
    }
    
}
