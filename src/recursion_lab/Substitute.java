/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Substitute {
    
    public static void main(String[] args) {
        
        System.out.println(substituteAI("Flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }
    
    public static String substituteAI(String x){
        
        // Takes the frontmost character of the String and assign it to a variable
        String front = x.substring(0, 1);
        
        // Checks whether the front is equal to 'a'
        // Will replace the front with 'i' if equals to 'a'
        if (front.equals("a")){
            front = "i";
        }
        
        // Base case: When String length is equals to 1, just print the String
        if (x.length() == 1){
            return front;
        } else {
            // Use recursion and subsequent String is the original String minus the frontmost Character
            return front + substituteAI(x.substring(1));
        }
    
    }
    
}
