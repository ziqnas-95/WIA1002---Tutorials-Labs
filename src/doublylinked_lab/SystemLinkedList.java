/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_lab;

import java.util.Scanner;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SystemLinkedList<E> {
    
    protected static int size = 0;
    SystemNode<E> head, tail;

    public SystemLinkedList() {
    }
    
    // similar to the addLast syntax
    public void add(E e){
        SystemNode<E> newNode = new SystemNode<>(e);
        if (size == 0){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    
    // must traverse through the list to find the element.
    public void removeElement(E e){
        SystemNode<E> current = head;
        SystemNode<E> temp;
        int index = 0;
        
        for (int i = 0; i < size; i++){
            if (current.element == e){
                index = i;
                break;
            }
            current = current.next;
        }
        
        
        if (getSize() == 0){
            System.out.println("The list is empty...");
            
            
        } else if (index == 0){
            head = head.next;
            size--;
            
        } else if (index == (size-1)){
            temp = head;
            for (int i = 1; i < size-1; i++){
                temp = temp.next;
            }
            tail = temp;
            size--;
            
        } else {
            temp = head;
            for (int i = 1; i < index; i++){
                temp = temp.next;
            }
            temp.next = (temp.next).next;
            size--;
        }
    }
    
    // traverse one by one and print it.
    public void printList(){
        if (size == 0){
            System.out.println("List is empty...");
        } else {
            SystemNode<E> current = head;
            for (int i = 0; i < size-1; i++){
                System.out.print(current.element + ", ");
                current = current.next;
            }
            System.out.println(current.element + ".");
        }
    }
    
    // just give out the size of the thing.
    public int getSize(){
        return size;
    }
    
    // traverse and see if the name matches with the elements in the list.
    public boolean contains(E e){
        boolean isTrue = false;
        if (size == 0){
            return isTrue;
        }
        SystemNode<E> current = head;
        for (int i = 0; i < size; i++){
            if ((current.element).equals(e)){
                isTrue = true;
                break;
            } else { 
            }
            current = current.next;
        }
        return isTrue;
    }
    
    // traverse and find the element 
    public void replace(E e, E newE){
        SystemNode<E> current = head;
        for (int i = 0; i < size; i++){
            if ((current.element).equals(e)){
                current.element = newE;
                break;
            } else {
                current = current.next;
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        
        //  Create a list first....
        SystemLinkedList<String> students = new SystemLinkedList<>();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end......");
        String name = scan.nextLine();
        while (name.equals("n") == false) {
            students.add(name);
            name = scan.nextLine();
        }
        
        System.out.println("\nYou have entered the following students' name :");
        students.printList();
        
        System.out.printf("\nThe number of students entered is : %d\n", students.getSize());
        
        // correct names?
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed...");
        String option = scan.next();
        while (option.equals("r")){
            System.out.println("Enter the existing student name that u want to rename :");
            name = scan.next();
            while (students.contains(name) == false){
                System.out.println("Not in list, please enter the existing student name that u want to rename :");
                name = scan.next();
            }
            break;
        } 
        System.out.println("Enter the new name :");
        String replace = scan.next();
        students.replace(name, replace);
        
        System.out.println("\nYou have entered the following students' name :");
        students.printList();
        
        // removing student input
    }

}