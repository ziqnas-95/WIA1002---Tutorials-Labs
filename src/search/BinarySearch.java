/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package search;

/**
 *
 * @author Haziq Nasaruddin
 */
public class BinarySearch {
    
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high)/2;
        
        while (low < high){
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
        
        int[] lex = list;
    
        for (int i = 0; i < lex.length; i++){
        
            for (int j = 0; j < lex.length; j++){
                if (j == lex.length-1){
                } else if (lex[j] > lex[j+1]){
                    int temp = lex[j+1];
                    lex[j+1] = lex[j];
                    lex[j] = temp;
                } else {
                
                }
            }
            
        }
        
        return lex;
    }
    
    public static void main(String[] args) {
        
        int[] arrayhihi = {1,2,3,4,5,6,5,4,7,6,4,8};
        int[] radical = sortArray(arrayhihi);
        int[] proper = {1,2,3,4,5,6,7,8};
//        
//        for (int n : radical){
//            System.out.print(n + " ");
//        }
        
        System.out.println(binarySearch(proper,4));
        
    }
    
}
