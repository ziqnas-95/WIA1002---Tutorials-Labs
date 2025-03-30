/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2_Generics;

/**
 *
 * @author Haziq Nasaruddin
 */
public class MyGeneric<T> {
    
    protected T e;
    
    public MyGeneric(){
    
    }
    
    public MyGeneric(T e){
        this.e = e;
    }
    
    public T getElement(){
        return e;
    }
    
    public void setElement(T e){
        this.e = e;
    }
    
}
