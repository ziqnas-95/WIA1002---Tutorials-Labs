/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_lab;

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
    
    public boolean contains(E e){
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            if (current.element == e){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public E get(int index){
        if (size == 0){
            return null;
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++){
                current = current.next;
            }
            return current.element;
        }
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
    
    public int indexOf(E e){
        if (contains(e) == true){
            Node<E> current = head;
            for (int i = 0; i < size; i++){
            if (current.element == e){
                return i;
            }
            current = current.next;
            }
        } else {
            return -1;
        }
        return -1;
    }
    
    public int lastIndexOf(E e){
        int update = indexOf(e);
        if (contains(e) == false){
            return -1;
        }
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            if (current.element == e){
                update = i;
            }
            current = current.next;
        }
        return update;
    }
    
    public E set(int index, E e){
        Node<E> temp = head;
        if (size == 0){
            addFirst(e);
        } else if (index >= size){
            set(size-1, e);
        } else {
            Node<E> current = head;
            for (int i = 0; i < size; i++){
                if (index == i){
                    temp = current;
                    current.element = e;
                }
                current = current.next;
            }
        }
        return temp.element;
    }
    
    public void clear(){
        while (size != 0){
            removeLast();
        }
    }
    
    public void print(){
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println("");
    }
    
    public void reverse(){
        E[] revArray = (E[]) new Object[size];
        Node<E> current = head;
        for (int i = 0; i < size; i++){
            revArray[i] = current.element;
            current = current.next;
        }
        for (int j = size-1; j >= 0; j--){
            System.out.print(revArray[j] + " ");
        }
        System.out.println("");
    }
    
    public E getMiddleValue(){
        int mid = size/2;
        Node<E> current = head;
        for (int i = 1; i <= mid; i++){
            current = current.next;
        }
        return current.element;
    }
    
    public static void main(String[] args) {
        
        MyLinkedList<Character> list = new MyLinkedList<>();
        
        /**
         *  (a) Append the following: a, b, c, d, e
         *  (b) Print all the elements in the list
         */
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        list.print();
        
        /**
         *  (c) Reverse all the elements in the list
         */
        //  printing just the reverse
        list.reverse();
        
        // literally reversing the list
        for (int i = 1; i <= 4; i++){
            char temp = list.get(5-i);
            list.addLast(temp);
        }
        for (int i = 1; i <= 4; i++){
            list.removeFirst();
        }
        list.print();
        
        /**
         *  (d) Retrieve the number of elements in the list
         *  (e) Retrieve first and last value
         *  (f) Delete the third value
         */
        System.out.println("Number of elements in the list: " + (list.indexOf(list.getLast()) + 1));
        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());
        list.remove(2);
        
        /**
         *  (g) Retrieve the index location for the first and third value
         *  (h) Checks if the list has the value 'c'
         */
        int second = list.indexOf(list.get(2));
        int third = list.indexOf(list.get(3));
        System.out.println(second + " " + third);
        
        System.out.println("Contains 'c'? " + list.contains('c'));
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');
        list.print();
        
        System.out.println(list.getMiddleValue());
        
    }
}
