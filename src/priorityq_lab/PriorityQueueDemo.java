/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priorityq_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Example 1: Basic usage with natural ordering (min heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Adding elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(1);
        
        System.out.println("Min Heap Priority Queue:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // Will print: 1, 5, 10, 15
        }
        
        // Example 2: Using a max heap (custom ordering)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(1);
        
        System.out.println("\nMax Heap Priority Queue:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Will print: 15, 10, 5, 1
        }
        
        // Example 3: Using priority queue with custom objects
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        
        taskQueue.add(new Task("Complete project", 3));
        taskQueue.add(new Task("Fix critical bug", 1)); // Highest priority
        taskQueue.add(new Task("Write documentation", 2));
        
        System.out.println("\nTask Priority Queue (by priority):");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll()); // Will print tasks in order of priority
        }
        
        // Example 4: Using a custom comparator
        PriorityQueue<Task> deadlineQueue = new PriorityQueue<>(Comparator.comparing(Task::getAmount));
                
        deadlineQueue.add(new Task("Task A", 2, "2023-12-15",120));
        deadlineQueue.add(new Task("Task B", 3, "2023-11-20",112));
        deadlineQueue.add(new Task("Task C", 1, "2024-01-10",119));
        
        System.out.println("\nTask Priority Queue (by amount):");
        while (!deadlineQueue.isEmpty()) {
            System.out.println(deadlineQueue.poll()); // Will print tasks in order of deadline
        }
    }
}

// Custom class that implements Comparable
class Task implements Comparable<Task> {
    private String name;
    private int priority; // Lower number = higher priority
    private String deadline;
    private int amount;
    
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
        this.deadline = "N/A";
    }
    
    public Task(String name, int priority, String deadline, int amount) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
        this.amount = amount;
    }
    
    public String getDeadline() {
        return deadline;
    }
    
    public int getAmount() {
        return amount;
    }
    
    // This defines the natural ordering of Task objects
    @Override
    public int compareTo(Task other) {
        // Compare by priority (lower number = higher priority)
//        return Integer.compare(this.priority, other.priority);
        return Integer.compare(other.priority, this.priority);
    }
    
    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Deadline: " + deadline + ", Amount: " + amount + ")";
    }
}
