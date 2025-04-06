/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_tuto2_generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MyArray<T> {
    
    public static void main(String[] args) {
        
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"Jane","Tom","Bob"};
        Character[] charArray  = {'a','b','c'};
        
        listArray(intArray);
        listArray(stringArray);
        listArray(charArray);
       
    }
    
    public static <T> void listArray(T[] array){
    
        System.out.println("Elements in the array:");
        for (T elements : array){
            System.out.print(elements + " ");
        }
        System.out.println("\n");
    }
    
    
    
}
