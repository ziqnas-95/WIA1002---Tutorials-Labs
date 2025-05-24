package doublylinked_lab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haziq Nasaruddin
 */
public class DLLNode<E> {
    
    E element;
    DLLNode<E> next;
    DLLNode<E> prev;
    
    public DLLNode(E element, DLLNode next, DLLNode prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public DLLNode(E element){
        this(element, null, null);
    }
}
