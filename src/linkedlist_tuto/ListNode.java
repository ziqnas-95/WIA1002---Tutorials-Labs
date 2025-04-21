/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_tuto;

/**
 *
 * @author Haziq Nasaruddin
 */
public class ListNode<E> {
    
    private static int size = 0;
    private Node<E> head, tail;
    
    public static void main(String[] args) {
        
        ListNode<Character> list = new ListNode<>();
        
        list.addFirst('e');         list.displayElements();
        list.addFirst('y');         list.displayElements();
        list.addFirst('r');         list.displayElements();
        list.addLast('f');          list.displayElements();
        list.add(1, 'g');           list.displayElements();
        list.clear();  
        list.addFirst('e');         list.displayElements();
        
    }
    
    public E getFirst(){
        if (size == 0){
            return null;
        } else {
            return head.element;
        }
    }
    
    public E getLast(){
        if (size == 0){
            return null;
        } else {
            return tail.element;
        }
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if (tail == null){
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    public void add(int index, E e){
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
            current.next = new Node<E>(e);
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
            if (head == null){
                tail = null;
            }
            return temp.element;
        }
    }
    
    public E removeLast(){
        switch (size) {
            case 0 -> {
                return null;
            }
            case 1 -> {
                Node<E> temp = head;
                head = tail = null;
                size = 0;
                return temp.element;
            }
            default -> {
                Node<E> current = head;
                for (int i = 1; i < size-1; i++){
                    current = current.next;
                }
                Node<E> temp = tail;
                tail = current;
                tail.next = null;
                size--;
                return temp.element;
            }
        }
    }
    
    public void displayElements(){
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void clear(){
        size = 0;
        head = tail = null;
    }
    
}
