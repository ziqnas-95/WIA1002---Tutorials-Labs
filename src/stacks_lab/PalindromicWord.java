/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks_lab;


/**
 *
 * @author Haziq Nasaruddin
 */
public class PalindromicWord {
    
    public static void main(String[] args) {
        
        String myword = "iceeci";
        boolean isP = true;
        
        GenericStack<Character> palindrome1 = new GenericStack<>();
        GenericStack<Character> palindrome2 = new GenericStack<>();
        
        for (int i=0; i < myword.length(); i++){
            palindrome1.push(myword.charAt(i));
        }
        
        for (int i=0; i < myword.length()/2; i++){
            palindrome2.push(palindrome1.pop());
        }
        
        if (myword.length() % 2 != 0){
            palindrome1.pop();
        }
        
        while (palindrome1.getSize() != 0){
            if (palindrome1.pop() != palindrome2.pop()){
                isP = false;
                break;
            } 
        }
        
        System.out.println(myword + " as a palindrome is " + isP);
        
    }
    
}
