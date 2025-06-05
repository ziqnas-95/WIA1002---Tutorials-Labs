/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

import java.util.Arrays;

/**
 *
 * @author Haziq Nasaruddin
 */
public class BinarySearch {
    
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high)/2;
        
        while (low <= high){
            if (key == list[mid]){
                return mid;
            } else if (key < list[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    
    }
    
    public static int[] sortArray(int[] list){
    
        for (int i = 0; i < list.length; i++){
        
            for (int j = 0; j < list.length; j++){
                if (i == list.length-1){
                } else if (list[i] > list[i+1]){
                    int temp = list[i+1];
                    list[i+1] = list[i];
                    list[i] = temp;
                }
            }
            
        }
        return list;
    }
    
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,5,4,7,6,4,8};
        int[] arrayS  = sortArray(array);
//        
//        for (int n : array){
//            System.out.print(n + " ");
//        }
//        
        System.out.println(binarySearch(arrayS,10));
        
    }
    
}
