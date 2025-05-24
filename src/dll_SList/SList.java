/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dll_SList;

import java.util.NoSuchElementException;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SList<E> {
    
    private int size;
    private SNode<E> head, tail;

    public SList() {
        size = 0;
        this.head = null;
        this.tail = null;
    }
    
    public void appendEnd(E e){
        
        SNode<E> tmp = new SNode(e, tail);
        if (size == 0){
            tmp.next = tail;
            head = tail = tmp;
        } else {
            tail.next = tmp;
            tail = tmp;
        }
        size++;
        System.out.println("added: " + tmp.element);
    }
    
    public void removeInitial(){
        
        if (size == 0){
            throw new NoSuchElementException();
        } else {
            E element = head.element;
            head = head.next;
            System.out.println("removed: " + element);
        }
        size--;
        
    }
    
    public boolean contains(E e){
        
        SNode<E> tmp = head;
        for (int i = 0; i < size; i++){
            if (tmp.element.equals(e)){
                System.out.println("contains: " + e);
                return true;
            } else {
                tmp = tmp.next;
            }
        }
        System.out.println("does not contain: " + e);
        return false;
    }
    
    public void clear(){
        
        int value = size;
        SNode<E> temp = head;
        while (head != null){
            temp = head.next;
            head.next = null;
            head = temp;
        }
        temp = null;
        tail.next = null;
        size = 0;
        System.out.println("successfully clear " + value + " node(s)");
    
    }
    
    public void display(){
    
        SNode<E> tmp = head;
        for (int i = 0; i < size; i++){
            System.out.print(tmp.element + " ");
            tmp = tmp.next;
        }
        System.out.println("");
    }
    
}


class TestSList {

    public static void main(String[] args) {
        
        SList<String> ayat = new SList<>();
        
        ayat.appendEnd("Linked list");
        ayat.appendEnd("is");
        ayat.appendEnd("easy");
        ayat.display();
        
        ayat.removeInitial();
        ayat.contains("difficult");
        ayat.clear();
        
    }






}
