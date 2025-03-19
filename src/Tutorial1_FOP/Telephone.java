/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1_FOP;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Telephone {
    
    //instance variables
    public String areaCode;
    public String number;

    //constructor
    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        
        numberOfTelephoneObject++;
    }
    
    //static variable that keeps track of the number of telephone objects created
    public static int numberOfTelephoneObject = 0;
    
    public int getNumTelephones(){
        return numberOfTelephoneObject;
    }
    
    //accessor method
    public String getNumber(){
        return this.number;
    }
    
    public String getAreaCode(){
        return this.areaCode;
    }
    
    //mutator method
    public void setNumber(String number){
        this.number = number;
    }
    
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    
    //method that concantenates both values into a string
    private String makeFullNumber(){
        return this.areaCode + "-" + this.number;
    }
    
    
    //main method
    public static void main(String[] args) {
        
        Telephone T1 = new Telephone("03","79676300");
        Telephone T2 = new Telephone("03","79676301");
        Telephone T3 = new Telephone("03","79676302");
        Telephone T4 = new Telephone("03","79676303");
        Telephone T5 = new Telephone("03","79676304");
        
        Telephone[] array = {T1,T2,T3,T4,T5};
        
        for (Telephone array1 : array) {
            String code = array1.makeFullNumber();
            System.out.println(code);
        }
        
        System.out.println("Number of telephone objects created: " + Telephone.numberOfTelephoneObject);
        
        
    }
    
    
}
