/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b_tuto2_generics;

import java.util.ArrayList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Question7{
    
    public static void main(String[] args) {

        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();
        
        allTransportation(vehicle,transportation); 

    }
    
    // method header for generic method
    public static <T> void allTransportation(ArrayList<?> list1,ArrayList<?>list2){
        System.out.println("This line is being read....");
    }
    
}
