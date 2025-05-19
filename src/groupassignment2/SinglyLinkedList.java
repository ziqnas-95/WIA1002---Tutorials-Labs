/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupassignment2;

/**
 *
 * @author Haziq Nasaruddin
 */
class SinglyLinkedList {
    
    static class Node {
        String data;
        Node next;
        static int size = 0;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }
    
    Node head, tail;
    
    public void addFirst(String msg) {
        Node newNode = new Node(msg);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public void addLast(String msg) {
        Node newNode = new Node(msg);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public String removeFirst() {
        if (head == null) {
            return null; 
        }
        String removedData = head.data;
        head = head.next;
        if (head == null){ 
            tail = null; 
        }
        return removedData;
    }
    
    public void print(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
}
