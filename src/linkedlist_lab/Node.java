/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Node<E> {
    
    E element;
    Node<E> next;

    public Node(){
        element = null;
        next = null;
    }
    
    public Node(E o){
        element = o;
        next = null;
    }
    
}
