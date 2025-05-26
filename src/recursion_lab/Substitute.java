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
        
        String front = x.substring(0, 1);
        if (front.equals("a")){
            front = "i";
        }
        
        if (x.length() == 1){
            return front;
        } else {
            return front + substituteAI(x.substring(1));
        }
    
    }
    
}
