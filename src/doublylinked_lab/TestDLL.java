/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestDLL {
    
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        
        myList.addFirst(1);
        myList.addLast(10);
        myList.addLast(100);
        myList.add(2, 2);
        myList.remove(3);
        System.out.println("");
        myList.traverseForward();
        myList.traverseBackward();
        System.out.println("");
        myList.getSize();
        myList.clear();
        myList.getSize();
        
    }
    
    
}
