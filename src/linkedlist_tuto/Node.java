/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_tuto;

/** 
 *
 * @author Haziq Nasaruddin
 */
public class Node<E> {
    
    protected static int size = 0;
    E element;
    Node<E> next;
    
    public Node(E o){
        element = o;
    }
    
    public static void printList(Node head){
        /** Traverse and print */
        for (int i = 0; i < size; i++){
            System.out.print(head.element + " ");
            head = head.next;
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        
        /** (a) Create two nodes called node1 and node2. Node1 contains alphabet ‘a’ and node2 contains alphabet ‘z’. 
         *      Also, create 2 references, head and tail. Let head points to node 1 and tail points to node 2.
         */
        Node<Character> Node1 = new Node<>('a');
        Node<Character> Node2 = new Node<>('z');
        Node<Character> head = null;
        Node<Character> tail = null;
        
        /** (c) Write a statement/code for node1 accessing the node2.
         */
        head = Node1;           // assign node1 to the head
        tail = Node2;           // assign node2 to the tail
        head.next = tail;       // put node2 as the next reference for the head
        size++;
        size++;
        printList(head);
        
        /** (d) Create a new node, firstNode. Add this new node at the first location of all existing nodes.
         */
        Node<Character> FirstNode = new Node<>('s');
        FirstNode.next = head;  // assign the head (node1) as the next reference for the FirstNode
        head = FirstNode;       // FirstNode is assigned as the head
        size++;
        printList(head);
        /** (e) If we have no information about the status of a linked-list, what are the conditions we
         *      need to consider to perform the operation in (d)?
         *  
         *   A: Conditions that we need to consider is when there are nodes at all in the linked-list.
         *      The node that would be assign will be both assigned to the head and tail.
         */
        
        /** (f) Write a list of operations/steps/pseudocode needed to add the firstNode to the first location
         *   
         *   A: Assign the head to the firstNode.next reference.
         *      Then, change the head to the firstNode which will then set firstNode as its new head.
         */
        
        /** addLast() 
         *  - assign the new node to the tail.next
         *  - assign the new tail.next to tail
         */
        Node<Character> Node3 = new Node<>('v');
        tail.next = Node3;
        tail = tail.next;
        tail.next = null;
        size++;
        printList(head);
        /** add(index, element) 
         *  - 
         *  - 
         */
        int index = 2;
        Node<Character> Node4 = new Node<>('e');
        Node<Character> current = head;
        for (int i = 1; i < index; i++){
            current = current.next;
        }
        Node<Character> temporary = current.next;
        current.next = Node4;
        (current.next).next = temporary;
        size++;
        printList(head);
        
        /** removeFirst() 
         *  - 
         *  - 
         */
        head = head.next;
        size--;
        printList(head);
        
        /** removeLast() 
         *  - 
         *  - 
         */
        current = head;
        for (int i = 1; i < size-1; i++){
            current = current.next;
        }
        tail = current;
        tail.next = null;
        size--;
        printList(head);
        
        /** remove(index, element) 
         *  - 
         *  - 
         */
        index = 1;
        current = head;
        for (int i = 1; i < index; i++){
            current = current.next;
        }
        current.next = (current.next).next;
        size--;
        printList(head);
    }

}
