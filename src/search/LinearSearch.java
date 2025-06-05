/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

/**
 *
 * @author Haziq Nasaruddin
 */
public class LinearSearch {
    
    public static int linearSearch(int[] list,  int key){
        
        for (int index = 0; index < list.length; index++){
            if (key == list[index]){
                return index;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,5,4,7,6,4,8};
        
        System.out.println(linearSearch(array,8));
        
    }
}
