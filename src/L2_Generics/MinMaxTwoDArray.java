/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MinMaxTwoDArray {
    
    public static <E extends Comparable<E>> E min(E[][] list){
    
        E min = list[0][0];
        int rows = list.length;
        int cols = list[0].length;
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (list[i][j].compareTo(min) < 0){
                    min = list[i][j];
                }
            
            }
            
        }
    
        return min;
    
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        
        E max = list[0][0];
        int rows = list.length;
        int cols = list[0].length;
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (list[i][j].compareTo(max) > 0){
                    max = list[i][j];
                }
            
            }
            
        }
    
        return max;
    }
    
    public static void main(String[] args) {
        
        Integer[][] myArr = {{4,5,6},{1,2,3}};
     
        System.out.println(max(myArr));
        System.out.println(min(myArr));
        
    }

}
