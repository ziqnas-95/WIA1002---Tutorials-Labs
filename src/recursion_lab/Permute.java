/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Permute {
    
    public static void main(String[] args) {
        
        perm("SUPER");
        
    }
    
    public static void perm(String x){
        
        permutate("",x);
    }
    
    public static void permutate(String prefix, String str){
        
        int size = str.length();
        
        if (size == 0){
            System.out.println(prefix);
            
        } else {
        
            for (int i = 0; i < size; i++){
            
                char head = str.charAt(i);

                String remain = str.substring(0, i) + str.substring(i+1, str.length());
                permutate(prefix + head, remain);
        
            }
        
        }
    
        
    
    }
    
}
