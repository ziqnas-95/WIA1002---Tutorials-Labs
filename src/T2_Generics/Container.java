/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Container<T> {

    public Container() {
        
    }
    
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T retrieve(){
        return t;
    }
    
    
    public static void main(String[] args) {
        
        Container<Integer> cont1 = new Container<>();
        Container<String> cont2 = new Container<>();
        
        cont1.add(50);
        cont2.add("Java");
        
        System.out.println(cont1.retrieve());
        System.out.println(cont2.retrieve());
        
    }
    
}
