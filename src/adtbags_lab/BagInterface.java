/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtbags_lab;

/**
 * An interface that describes the operations of a bag of objects.
 * @author Haziq Nasaruddin
 */

public interface BagInterface<T> 
{
    /** Gets the current number of entries in this bag.
        @return the integer number of entries currently in the bag 
        */
    public int getCurrentSize();

    /** Sees whether this bag is full.
        @return true if the bag is full, or false if not 
        */
    public boolean isFull();

    /** Sees whether this bag is empty.
        @return true if the bag is empty, or false if not 
        */
    public boolean isEmpty();

    /** Adds a new entry to this bag.
        @param newEntry the object to be added as a new entry
        @return true if the addition is successful, or false if not 
        */
    public boolean add(T newEntry);

    /** Removes one unspecified entry from this bag, if possible.
        @return either the removed entry, if the removal was successful,
        or null 
        */
    public T remove();

    /** Removes one occurrence of a given entry from this bag.
        @param anEntry the entry to be removed
        @return true if the removal was successful, or false if not 
        */
    public boolean remove(T anEntry);

    /** Removes all entries from this bag. */
    public void clear();

    /** Counts the number of times a given entry appears in this bag.
        @param anEntry the entry to be counted
        @return the number of times anEntry appears in the bag 
        */
    public int getFrequencyOf(T anEntry);

    /** Tests whether this bag contains a given entry.
        @param anEntry the entry to locate
        @return true if this bag contains anEntry, or false otherwise 
        */
    public boolean contains(T anEntry);

    /** Retrieves all entries that are in this bag.
        @return a newly allocated array of all the entries in the bag 
        */
    public T[] toArray();

    /** Creates a new bag that combines the contents of this bag and anotherBag.
        @param anotherBag  The bag that is to be added.
        @return  A combined bag. 
        */
    public BagInterface<T> union(BagInterface<T> anotherBag);

    /** Creates a new bag that contains the overlapping entries of each bag
        @param anotherBag The bag that is to be intersected
        @return A bag that contains the intersection of the two bags
        */
    public BagInterface<T> intersection(BagInterface<T> anotherBag);

    /** Creates a new bag that contains the difference of entries in each bag
        @param anotherBag The bag that is to be parsed into the method
        @return a bag that contains the difference of two bags.
        */
    public BagInterface<T> difference(BagInterface<T> anotherBag);
}