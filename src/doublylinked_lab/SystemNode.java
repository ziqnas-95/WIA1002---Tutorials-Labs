/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SystemNode<E> {
    
    E element;
    SystemNode<E> next;

    public SystemNode(){
    }
    
    public SystemNode(E o){
        element = o;
    }
    
}