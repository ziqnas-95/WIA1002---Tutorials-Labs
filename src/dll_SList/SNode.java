/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dll_SList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SNode<E> {
    
    E element;
    SNode<E> next;

    public SNode(E element, SNode<E> next) {
        this.element = element;
        this.next = next;
    }
    
    public SNode(){
        this.element = null;
        this.next = null;
    }
    
}
