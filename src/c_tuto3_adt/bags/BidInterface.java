/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c_tuto3_adt.bags;

/**
 *
 * @author Haziq Nasaruddin
 */
public interface BidInterface
{
    /** Gets the name of the current company making this bid.
        @return the name of the company in String. */
    public String getName();
    
    /** Gets the description of the air conditioner currently on bid.
        @return the description of the air conditioner in String. */
    public String getDescription();
    
    /** Gets the capacity of the AC in tons. (Convert formula: 1 ton = 12000 BTU)
        Convert the value of BTU to tons by applying a calculation formula in the method.
        @return the capacity value of the air conditioner in tons. */
    public double getCapacity();
    
    /** Gets the seasonal efficiency of the AC.
        @return the SEER value of the AC in double. */
    public double getSEER();
        
    /** Gets the cost of making the AC.
        @return the cost of the AC in double. */
    public double getBidCost();
    
    /** Gets the cost of installing the AC.
        @return the double value of the cost of installing the AC. */
    public double getInstallCost();
    
    /** Gets the yearly cost needed to operate the AC.
        @return the double value of the yearly operating cost of the AC. */
    public double getYearlyCost();
    
}
