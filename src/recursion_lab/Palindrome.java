/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Palindrome {
    
    public static void main(String[] args) {
        
        String test = "racecar";
        System.out.println(test + " as a palindrome is " + isPalindrome(test));
        
    }
    
    public static boolean isPalindrome(String word){
        
        return palindromeHelper(word, 0, word.length()-1);
    
    }
    
    public static boolean palindromeHelper(String word, int head, int tail){
    
        //base case
        //recursive case
        
        if (head >= tail){
            return true;
        }
        if (word.charAt(head) != word.charAt(tail)){
            return false;
        }
        return palindromeHelper(word, head+1, tail-1);
    }
    
}
