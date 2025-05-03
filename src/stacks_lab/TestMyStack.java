/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestMyStack {
    
    public static void main(String[] args) {
        
        //QUESTION 1B
        GenericStack<Character> charlist = new GenericStack<>();
        
        charlist.push('a');
        charlist.push('b');
        charlist.push('c');
        
        System.out.println(charlist.toString());
        
        System.out.println(charlist.search('b'));
        System.out.println(charlist.search('k'));

        //QUESTION 1C
        GenericStack<Integer> intlist = new GenericStack<>();
        
        intlist.push(1);
        intlist.push(2);
        intlist.push(3);
        
        System.out.println(intlist.toString());
        
        System.out.println(intlist.search(6));
        
    }
    
}
