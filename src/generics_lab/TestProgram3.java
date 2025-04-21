/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestProgram3 {
    
    public static void main(String[] args) {
        
        StorePairGeneric<Integer> a = new StorePairGeneric(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric(6,3);
        
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(b));
        System.out.println(a.compareTo(c));
        
        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
        System.out.println(a.equals(c));
    }
    
}
