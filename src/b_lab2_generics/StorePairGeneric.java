/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_lab2_generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class StorePairGeneric<T> implements Comparable<StorePairGeneric<T>> {
    
    private T first;
    private T second;
    
    public StorePairGeneric(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    public T getFirst(){
        return first;
    }
    
    public T getSecond(){
        return second;
    }
    
    public void setPair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public String toString(){
        return "first= " + first + "\tsecond= " + second;
    }
    
    // b) override the Object equals() method
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        StorePairGeneric<?> other = (StorePairGeneric<?>) obj;
        return first.equals(other.first);
    }
    
    // c) implements the Comparable interface and override the compareTo method
    @Override
    public int compareTo(StorePairGeneric<T> other) {
        
        return ((Comparable) first).compareTo(other.first);
        
    }

}
