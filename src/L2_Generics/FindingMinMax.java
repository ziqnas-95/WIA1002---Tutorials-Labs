/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class FindingMinMax {
    
    public static <T extends Comparable<T>> String minmax(T[] array){
        
        int size = array.length;
        T min = array[0];
        T max = array[size-1];
        
        for (int i = 0; i < size; i++){
            
            if (array[i].compareTo(min) < 0){
                min = array[i];
            } else if (array[i].compareTo(max) > 0){
                max = array[i];
            }
            
        }
        
        return "Min = " + min + "   Max = " + max;
    }
    
    public static void main(String[] args) {
        
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red","blue","orange","tan"};
        
        System.out.println(minmax(strArray));
        System.out.println(minmax(intArray));
        
    }
    
}
