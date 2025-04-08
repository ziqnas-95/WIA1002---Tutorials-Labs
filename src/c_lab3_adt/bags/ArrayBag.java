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
    private static int DEFAULT_CAPACITY = 25;
    private int numberOfEntries = 0;

    
    public ArrayBag(){
        bag = (T[]) new Object[DEFAULT_CAPACITY];
        numberOfEntries = 0;
    }
    
    private ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
        numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
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
        if (!isEmpty()){
            T removedEntry = bag[numberOfEntries];
            bag[numberOfEntries] = null;
            numberOfEntries--;
            return removedEntry;
        }
        return null;
    }
    
    @Override
    public boolean remove(T anEntry) {
        if (!isEmpty()){
            for (int i = 0; i < numberOfEntries; i++){
                if (bag[i].equals(anEntry)){
                    
                    bag[i] = bag[numberOfEntries];
                    bag[numberOfEntries] = null;
                    numberOfEntries--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            remove();
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry)){
                frequency++;
            }
        }
        return frequency;
    }

    @Override
    public boolean contains(T anEntry) {
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry)){
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++){
            result[i] = bag[i];
        }
        return result;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> anotherBag) {
        BagInterface<T> unionBag = new ArrayBag<>(this.getCurrentSize() + anotherBag.getCurrentSize());
        for (T entry : this.toArray()){
            unionBag.add(entry);
        }
        for (T entry : anotherBag.toArray()){
            unionBag.add(entry);
        }
        return unionBag;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> anotherBag) {
        BagInterface<T> intersectionBag = new ArrayBag<>();
        
        for (T entry : this.toArray()){
            if (anotherBag.contains(entry) && !intersectionBag.contains(entry)){
                int x = this.getFrequencyOf(entry);
                int y = anotherBag.getFrequencyOf(entry);
                if (x < y){
                    for (int i = 0; i < x; i++){
                        intersectionBag.add(entry);
                    }
                } else {
                    for (int i = 0; i < y; i++){
                        intersectionBag.add(entry);
                    }
                }
            }
        }
        return intersectionBag;
    }

    
    /** Encountering problem here because it is not the same for the opposite function...
        Must adjust the code so that it is possible that it can work both ways...
        */
    @Override
    public BagInterface<T> difference(BagInterface<T> anotherBag) {
        BagInterface<T> differenceBag = new ArrayBag<>();
        
        for (T entry : this.toArray()){
            if (anotherBag.contains(entry) && !differenceBag.contains(entry)){
                int x = this.getFrequencyOf(entry);
                int y = anotherBag.getFrequencyOf(entry);
                if (y < x){
                    for (int i = 0; i < x-y; i++){
                        differenceBag.add(entry);
                    }
                } 
                
            } else if (!anotherBag.contains(entry)){
                differenceBag.add(entry);
            }
        }
        return differenceBag;
    }
    
}
