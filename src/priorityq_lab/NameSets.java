/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityq_lab;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Haziq Nasaruddin
 */
public class NameSets {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> set1 = new PriorityQueue<>();
        PriorityQueue<String> set2 = new PriorityQueue<>();
        
        String[] name1 = {"GEORGE","JIM","JOHN","BLAKE","KEVIN","MICHAEL"};
        String[] name2 = {"GEORGE","KATIE","KEVIN","MICHELLE","RYAN"};
        
        for(String x : name1){
            set1.add(x);
        }
        for(String y : name2){
            set2.add(y);
        }
        System.out.print("PRIORITYQ 1: ");
        while (!set1.isEmpty()){
            System.out.print(set1.poll() + " ");
        }
        
        System.out.print("\nPRIORITYQ 2: ");
        while (!set2.isEmpty()){
            System.out.print(set2.poll() + " ");
        }
        
        System.out.println("\n");
        for(String x : name1){
            set1.add(x);
        }
        for(String y : name2){
            set2.add(y);
        }
        
        Set<String> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
        
        Set<String> difference12 = new TreeSet<>(set1);
        difference12.removeAll(set2);
        System.out.println("Diff: " + difference12);
        
        Set<String> difference21 = new TreeSet<>(set2);
        difference21.removeAll(set1);
        System.out.println("Diff: " + difference21);
        
        Set<String> intersect = new TreeSet<>(set1);
        intersect.retainAll(set2);
        System.out.println("Intersect: " + intersect);
        
    }
    
}
