/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_lab3_adt.bags;

import java.util.Arrays;

/**
 *
 * @author Haziq Nasaruddin
 */
public class ArrayBagDemo {
    
    public static void main(String[] args) {
        
        ArrayBag<String> bag1 = new ArrayBag<>();
        ArrayBag<String> bag2 = new ArrayBag<>();
        
        String[] contentB1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentB2 = {"A", "B", "A", "C", "B", "C", "D", "another String"};
        
        System.out.println("Bag 1: ");
        testAdd(bag1, contentB1);
        System.out.print("Adding: ");
        displayBag(bag1);
        System.out.println("\nThe bag contains " + bag1.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag1);
        System.out.println("\n");
        
        System.out.println("Bag 2: ");
        testAdd(bag2, contentB2);
        System.out.print("Adding: ");
        displayBag(bag2);
        System.out.println("\nThe bag contains " + bag2.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag2);
        System.out.println("\n");
        
        System.out.println("Bag 3, test the method union of Bag1 and Bag2: ");
        ArrayBag<String> bag3 = (ArrayBag<String>) bag1.union(bag2);
        System.out.println("The bag contains " + bag3.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag3);
        System.out.println("\n");
        
        System.out.println("Bag 4, test the method intersection of bag1 and bag2: ");
        ArrayBag<String> bag4 =  (ArrayBag<String>) bag1.intersection(bag2);
        System.out.println("The bag contains " + bag4.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag4);
        System.out.println("\n");
        
        System.out.println("Bag 5, test the method difference of bag1 and bag2: ");
        ArrayBag<String> bag5 = (ArrayBag<String>) bag1.difference(bag2);
        System.out.println("The bag contains " + bag5.getCurrentSize() + " string(s), as follows: ");
        displayBag(bag5);
        System.out.println("\n");

    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for (String content1 : content) {
            aBag.add(content1);
        }
    }
    
    private static void displayBag(BagInterface<String> aBag){
        String output = Arrays.toString(aBag.toArray()).replace("[", "").replace("]", "").replace(",","");
        System.out.print(output);
    }
}
