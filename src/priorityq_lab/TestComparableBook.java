/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityq_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
import java.util.Queue;
import java.util.PriorityQueue;

public class TestComparableBook {

    public static void main(String[] args) {

        Queue<ComparableBook> BookQueue = new PriorityQueue<>();

        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));

        System.out.println(BookQueue);

        while (BookQueue.peek() != null) {
            System.out.println("Head Element:\t" + BookQueue.peek());
            BookQueue.remove();
            System.out.println("Priority queue:\t" + BookQueue);
            System.out.println("");
        }
    }
}

class ComparableBook implements Comparable<ComparableBook>{
    
    int code;
    String name;
    
    public ComparableBook(int code, String name){
        this.code = code;
        this.name = name;
    }
    
    @Override
    public int compareTo(ComparableBook other) {
        return Integer.compare(this.code, other.code);
//        return Integer.compare(other.code, this.code);
    }

    @Override
    public String toString() {
//        return "ComparableBook{" +
//                "bookId=" + code +
//                ", title='" + name + '\'' +
//                "}";
        
        return "ID: " + code + "  TITLE: " + name + " ";
    }
}