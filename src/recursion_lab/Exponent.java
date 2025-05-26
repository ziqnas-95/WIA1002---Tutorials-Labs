/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Exponent {
    
    public static void main(String[] args) {
        
        System.out.println(exponent(10,3));
        System.out.println(exponent(2,2));
        
    }
    
    public static long exponent(int x, int m){
    
        if (m > 0){
            return x * exponent(x, m-1);
        } else {
            return 1;
        }
    }
}
