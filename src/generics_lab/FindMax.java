/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class FindMax {
    
    public static <E extends Comparable<E>> E max(E[] list){
        
        E max = list[0];
        
        for (E elements : list){
            if (elements.compareTo(max) > 0){
                max = elements;
            }
        }
        
        
        return max;
    }
    
    public static void main(String[] args) {
        
        Integer[] intArr = {1,2,3};
        String[] strArr = {"red","green","blue"};
        Circle[] cirArr = {new Circle(3.0), new Circle(2.9), new Circle(5.9)};
        
        System.out.println(max(intArr));
        System.out.println(max(strArr));
        System.out.println(max(cirArr).radius);
                       
    }
    
}

class Circle implements Comparable<Circle>{
    
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        return ((Comparable) radius).compareTo(o.radius);
    }
    
}
