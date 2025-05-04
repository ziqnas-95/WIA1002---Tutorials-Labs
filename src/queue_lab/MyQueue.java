/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MyQueue<E> {
    
    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    
    public MyQueue(E[] e){
        for (E els:e){
            list.addLast(els);
        }
    }
    
    public MyQueue(){
    
    }
    
    public void enqueue(E e) {
        list.addLast(e);
    }
    
    public E dequeue() {
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public int getSize() {
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString() {
      return "Queue: " + list.toString();
    }
    
}
