/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dll_SList;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TestSList {
    
    public static void main(String[] args) {
        
        SList<String> ayat = new SList<>();
        
        ayat.appendEnd("Linked list");
        ayat.appendEnd("is");
        ayat.appendEnd("easy");
        ayat.display();
        
        ayat.removeInitial();
        ayat.contains("difficult");
        ayat.clear();
        
    }
    
}
