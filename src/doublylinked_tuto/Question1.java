/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_tuto;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Question1 {
}

//    public E xyz(int index, E e) {
//        Node<E> current = head;
//        Node<E> temp;
//
//        if (index < 0) return null;
//        else if (index >= size - 1) {
//            this.addLast(e);
//            return null;
//        } else if (index == 0) {     cut off this part of code as it is redundant
//            temp = head;
//            head.element = e;
//            return temp.element;
//        } else {
//            for (int i = 1; i < index; i++) {
//                current = current.next;
//            }
//            temp = current.next;
//            current.next.element = e;
//            return temp.element;
//        }
//    }

/**
 *  a) Based on the above source code, explain what lines of code do from line 10-21
 *  -  Checks if the index is equal to 0 (which means the head node)
 *     It assigns the current head to a temporary node and then resets the current head element to the new element.
 *     Then it will return the previous element that has been replaced.
 * 
 *  -  Similar to lines 10-13 but with additional steps. As it is not the head node, the lines will traverse through
 *     the linked-list until it reaches the node before the targeted node.
 *     Then, it will assign the next reference of the current node to a temporary node.
 *     It will then replace next node reference's element to the new element.
 *     In the end, the code will return the previous element that has been replaced.
 *  
 *  b) What is the main purpose of method xyz()?
 *  -  Main purpose of the method is to replace the element in the list at a specific index
 * 
 *  c) Debug the code and make it concise and simpler.
 */
