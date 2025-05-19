/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupassignment2;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SinglyLinkedListIndexed extends SinglyLinkedList{

    void addAt(int index, String msg){
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if (index == 0) {
            addFirst(msg);
            return;
        }

        Node newNode = new Node(msg);
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            if (currentIndex == index - 1) { // Adding at the end
                addLast(msg);
            } else {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) { // If the new node is the new tail
            tail = newNode;
        }

    }
    
    String removeAt(int index){
        
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException("Index cannot be negative or list is empty");
        }
        if (index == 0) {
            return removeFirst();
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        String removedData = current.data;
        previous.next = current.next;

        if (current == tail) { // If the removed node was the tail
            tail = previous;
        }

        return removedData;
    }
        

    
    public static void main(String[] args) {
        
        SinglyLinkedListIndexed indexedList = new SinglyLinkedListIndexed();

        System.out.println("--- Adding elements ---");
        indexedList.addLast("Element 0");
        indexedList.addLast("Element 2");
        indexedList.addFirst("Element -1");
        indexedList.print();
        
        indexedList.addAt(1, "Durian");
        indexedList.print();
        
        String x = indexedList.removeAt(1);
        System.out.println("Removed: " + x);
        indexedList.print();
        
        indexedList.removeFirst();
        indexedList.print();
        
    }
}


// Group Tutorial [Tutorial 1, Tutorial 2, Tutorial 3]
// Group Members:
// Student 1: [Aqil Amani bin Misni] - Singly LinkedList
// Student 2: [Muhammd Haziq bin Nasaruddin] - Indexed List
// Student 3: [Imran Haziq bin Khairul Anuar] - Doubly Linked List with Cursor
// Student 4: [Muhammad Arfan bin Zamri] - Doubly Linked List with Cursor
// Student 5: [Edlan Nabil bin Akmal Hamdi] - Undo/Redo with Stack
// Student 6: [Muhammad Amir Haziq bin Murad] - Testing