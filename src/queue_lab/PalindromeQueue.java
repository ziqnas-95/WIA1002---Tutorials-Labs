/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class PalindromeQueue {
    
    public static void main(String[] args) {
        
        String pln = "abby";
        Character[] array = new Character[pln.length()];
        for (int i = 0; i < pln.length(); i++){
            array[i] = pln.charAt(i);
        }
                
        MyQueue<Character> word = new MyQueue<>(array);
        System.out.println(word.getSize());
        boolean isPln = true;
        int treshold = array.length/2;
        int size = word.getSize();
        
        for (int i = 0; i < treshold; i++){
            
            if (word.getElement(i).equals(word.getElement(word.getSize()-(1+i)))){
            } else {
                isPln = false;
                break;
            }
        }
        
        System.out.println(pln + " as palindrome is " + isPln);
        
        
    }
    
}
