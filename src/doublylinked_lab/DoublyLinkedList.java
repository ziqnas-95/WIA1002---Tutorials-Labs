/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class DoublyLinkedList<E> {
    
    private DLLNode<E> head;
    private DLLNode<E> tail;
    private int size;

    /**
     * Initializing the set of nodes in the doubly linked list
     * The pointer for the head and tail is still null
     * Initial size of the set is also 0 as no nodes have been added
     */
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void addFirst(E element){
        //Create a new node object and set the pointer of the new node
        DLLNode<E> tmp = new DLLNode(element, head, null);
        
        /**
         * This checks whether there is already an element in the list
         * If not null, then the current head previous pointer will point to tmp
         * Creating a new head, then we must also update the new head as tmp
         */
        if (head != null){
            head.prev = tmp;
        }
        head = tmp;
        
        if (tail == null){
            tail = tmp;
        }
        size++; //increase size of the set
        System.out.println("adding: " + element);
    }
    
    public void addLast(E element){
        
        //Create a new node object and set the pointer of the new node
        DLLNode<E> tmp = new DLLNode(element, null, tail);
        
        /**
         * This checks whether there is already an element in the list
         * If not null, then the current tail next pointer will point to tmp
         * Adding a new tail, then we must also update the new tail as tmp
         */
        if (tail != null){
            tail.next = tmp;
        }
        tail = tmp;
        
        if (head == null){
            head = tmp;
        }
        size++; //increase size of the set
        System.out.println("adding: " + element);
    }
    
    public void add(int index, E element){
    
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        } else if (index == 0){
            addFirst(element);
        } else if (index == size){
            addLast(element);
        } else {
            
            DLLNode<E> temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            
            DLLNode<E> insert = new DLLNode(element, temp, temp.prev);
            temp.prev.next = insert;
            temp.prev = insert;
            
            size++;
        }
    }
    
    public void traverseForward(){
        
        System.out.println("traversing forward..");
        DLLNode<E> temp = head;
        while (temp != null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    public void traverseBackward(){
        
        System.out.println("traversing backward..");
        DLLNode<E> temp = tail;
        while (temp != null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        
        list.addFirst(12);
        list.addFirst(13);
        list.addLast(3);
        list.add(2, 67);
        
        list.traverseForward();
        list.traverseBackward();
    }
}
