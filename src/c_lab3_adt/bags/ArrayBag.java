/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_lab3_adt.bags;

/**
 *
 * @author Haziq Nasaruddin
 */
public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return bag.length >= DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return bag.length == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if (isFull() == false){
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        T result = removeEntry(numberOfEntries -1);
        return result;
    }
    
    private T removeEntry(int indexWanted){
        T result = null;
        
        if (!isEmpty() && bag.length > 0){
            result = bag[indexWanted];
            int lastID = numberOfEntries - 1;
            bag[indexWanted] = bag[lastID];
            bag[lastID] = null;
            numberOfEntries--;
        }
        return result;
    }

//    @Override
//    public boolean remove(T anEntry) {
//    }
//
//    @Override
//    public void clear() {
//    }
//
//    @Override
//    public int getFrequencyOf(T anEntry) {
//    }
//
//    @Override
//    public boolean contains(T anEntry) {
//    }
//
//    @Override
//    public T[] toArray() {
//    }
//
//    @Override
//    public BagInterface<T> union(BagInterface<T> anotherBag) {
//    }
//
//    @Override
//    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
//    }
//
//    @Override
//    public BagInterface<T> difference(BagInterface<T> anotherBag) {
//    }
    
    
}
