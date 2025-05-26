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
        
        permutate("abc");
        
    }
    
    public static void permutate(String str){
    
        int n = str.length();
        
        if (n == 1){
            System.out.print(str);
        } else {
        
            for (int i = 0; i < n; i++){
            
                char firstChar = str.charAt(i);
                String tbr = String.valueOf(firstChar);
                
                String remaining = str.replaceFirst(tbr, "");
                
                permutate(remaining);
                
            }
        
        
        
        }
    
    }
    
}
