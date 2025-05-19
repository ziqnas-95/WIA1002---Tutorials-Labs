/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityq_lab;

import java.util.PriorityQueue;

/**
 *
 * @author Haziq Nasaruddin
 */
public class IntegerArray {
    
    public static void main(String[] args) {
        
        Integer[] intArray = {4,8,1,2,9,6,3,7};
        
        PriorityQueue<Integer> intQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(java.util.Comparator.reverseOrder());
        for (Integer x : intArray){
            intQ.add(x);
            maxHeap.add(x);
        }
        //toString method
        System.out.println(intQ);
        
        //poll method
        System.out.println("");
        System.out.println(intQ.poll());
        
        //add method
        System.out.println("Adding 5 into the q");
        intQ.add(5);
        
        //toArray method
        System.out.println("");
        Object[] myArr = (Object[]) intQ.toArray();
        for (Object y : myArr){
            System.out.println(y);
        }
        
        //peek method
        System.out.println("");
        System.out.println(intQ.peek());
        
        //contains method
        System.out.println("");
        System.out.println(intQ.contains(1));
        
        //size method
        System.out.println(intQ.size());

        //isEmpty method with the poll method
        System.out.println("");
        while (!intQ.isEmpty()){
            System.out.println(intQ.poll());
        }
        
        System.out.println("");
        while (!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }
        
        
    }
    
    
    
}
