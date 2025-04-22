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
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = (temp.next).next;
            head = temp;
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
        
        String name, replace, option;
        
        banner1();
        name = scan.nextLine();
        while (name.equals("n") == false) {
            students.add(name);
            name = scan.nextLine();
        }
        
        banner2();
        students.printList();
        
        banner3(); System.out.println(students.getSize());
        
        // correct names?
        banner4();
        option = scan.next();
        while (option.equals("r")){
            banner5();
            name = scan.next();
            while (students.contains(name) == false){
                banner5c();
                name = scan.next();
            }
            break;
        } 
        banner5b();
        replace = scan.next();
        students.replace(name, replace);
        
        banner2b();
        students.printList();
        
        // removing student input
        banner4b();
        option = scan.next();
        while (option.equals("y")){
            banner5d();
            name = scan.next();
            while (students.contains(name) == false){
                banner5c();
                name = scan.next();
            }
            break;
        } 
        students.removeElement(name);
        
        banner3b(); System.out.println(students.getSize());
        banner2b(); 
        students.printList();
        
        System.out.println("All student data captured complete. Thank you...");
    }
    
    public static void banner1(){
        System.out.println("Enter your student name list. Enter 'n' to end...");
    }
    
    public static void banner2(){
        System.out.println("You have entered the following students name :");
    }
    
    public static void banner2b(){
        System.out.println("The new student list is :");
    }
    
    public static void banner3(){
        System.out.print("The number of students entered is :");
    }
    
    public static void banner3b(){
        System.out.print("The number of updated students are :");
    }
    
    public static void banner4(){
        System.out.println("All the names are entered correct? Enter 'r' to rename the student name, 'n' to proceed.");
    }
    
    public static void banner4b(){
        System.out.println("Do you want to remove any of your student from the list? Enter 'y' for yes, 'n' to proceed?");
    }
    
    public static void banner5(){
        System.out.println("Enter the existing student name to rename :");
    }
    
    public static void banner5b(){
        System.out.println("Enter the new name : ");
    }
    
    public static void banner5c(){
        System.out.println("Name is not in the list. Please enter an existing name : ");
    }
    
    public static void banner5d(){
        System.out.println("Enter the existing student name to remove :");
    }
    
    
}