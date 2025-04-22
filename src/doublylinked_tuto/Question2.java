/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinked_tuto;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Question2 {
}

//    else {
//        Node<E> temp = head;
//        for (int i = 0; i < index; i++) {
//            temp = temp.next;
//        }
//        element = temp.element;
//        temp.next.prev = temp.prev;
//        temp.prev.next = temp.next;
//        temp.next = null;
//        temp.prev = null;
//        size--;
//    }

/**
 *  a) Explain what lines of code do from line 2-11
 *  -  It is a snippet of code from a doubly linked-list.
 *     It assigns the head node to a temporary node to be used for traversing.
 *     The next reference of the temp will be assigned to the temp node showing that it is traversing.
 *     Reaching the targeted node, it will assign its element to a new element variable;
 *     The next node will have new references assigned to it, where it will get the previous reference of the current node
 *     and also the next reference of the current node too.
 *     The line of code will also reduce the size of the list by 1 node.
 *  
 *  b) Draw the nodes for lines 7-10.
 * 
 */