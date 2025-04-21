/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestProgram1 {
    
    public static void main(String[] args) {
        
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();
        
        strObj.setElement("Circle");
        intObj.setElement(4);
        
        System.out.println(strObj.getElement());
        System.out.println(intObj.getElement());
        
    }
    
}
