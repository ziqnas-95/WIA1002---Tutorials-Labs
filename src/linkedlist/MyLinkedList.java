/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MyLinkedList<E> {
    
    protected static int size = 0;
    Node<E> head, tail;

    public MyLinkedList() {
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        if (size == 0){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (size == 0){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
        Node<E> newNode = new Node<>(e);
        if (index == 0){
            addFirst(e);
        } else if (index >= size){
            addLast(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = newNode;
            (current.next).next = temp;
            size++;
        }
        
    }
    
    public E removeFirst(){
        if (size == 0){
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            return temp.element;
        }
    }
    
    public E removeLast(){
        if (size == 0){
            return null;
        } else {
            Node<E> current = head;
            for (int i = 1; i < size-1; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index){
        E decision;
        if (size == 0 || size == 1){
            decision = removeFirst();
        } else if (index >= size){
            decision = removeLast();
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = (current.next).next;
            size--;
            return temp.element;
        }
        return decision;
    }
    
    public void print(){
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            System.out.println(current.element);
            current = current.next;
        }
        
    
    }
    
    
    
    
    public static void main(String[] args) {
        
        MyLinkedList<String> list = new MyLinkedList<>();
        
        list.addFirst("h");
        list.addFirst("ha");
        list.addLast("haziq");
        list.add(1, "haziq nasaruddin");
        list.print();
        list.removeLast();
        list.removeFirst();
        list.remove(1);
        list.print();
    }
    
}
