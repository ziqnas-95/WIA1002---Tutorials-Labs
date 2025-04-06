/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_tuto3_adt.bags;

/**
 *
 * @author Haziq Nasaruddin
 */
public interface BidCollectionInterface 
{
    /** Adds a bid to this collection.
        @param bid The bid to add. Must not be null.
        @precondition bid != null
        @postcondition The bid is added to the collection increasing its size.
    */
    public void addBid(BidInterface bid);
    
    /** Returns the best yearly cost for the AC.
        If the collection is empty, returns null.
        @return The bid with the lowest yearly operating cost, or null if the collection is empty.
        @postcondition The collection will remain unchanged.
    */
    public BidInterface getBestYearlyCost();
    
    /** Returns the best initial cost which are calculated using the unit cost and installation cost.
        If the collection is empty, returns null.
        @return The bid with the best initial cost, or null if the collection is empty.
        @postcondition The collection will remain unchanged.
        */
    public BidInterface getBestInitialCost();
    
    /** Clears all the bids inside the collection.
        @postcondition The collection is empty
        */
    public void clearAllBids();
    
    /** Returns the number of bids available in the collection.
        @return The number of bids in the collection.
        @postcondition The collection remains unchanged.
        */
    public int getNumberOfItems();
    
    /** Sees whether the collection is empty.
        @return True if the collection contains no bids, false otherwise.
        @postcondition The collection remains unchanged.
        */
    public boolean collectionIsEmpty();
    
}
