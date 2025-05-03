/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stacks_lab;

import java.util.Scanner;
/**
 *
 * @author Haziq Nasaruddin
 */
public class TestIntMyStack {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter an integer value:");
        int input = scan.nextInt();
        
        GenericStack<Integer> myintlist = new GenericStack<>();
        
        for (int i = 0; i < input; i++){
            myintlist.push(1);
        }
        
        System.out.println("Size of stack is: " + myintlist.getSize());
        
        System.out.println(findSum(myintlist));
        
        while (myintlist.getSize() != 0){
            System.out.print(myintlist.pop() + " ");
        }
        
    }
    
    
    public static int findSum(GenericStack<Integer> list){
        int sum = 0;
        while (list.getSize() != 0){
            sum += list.pop();
        }
        return sum;
    }
    
}
