/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion_lab;

/**
 *
 * @author Haziq Nasaruddin
 */
public class TutorialQuestions {
    
    public static void main(String[] args) {
        
        System.out.println(calculateSum(5));
        reverseString("My name is Muhammad Haziq bin Nasaruddin");
        System.out.println(" ");
        printDigit(-4567);
        
    }
    
    /**
     * QUESTION 3: Reversing a String 
     */
    public static void reverseString(String myStr){
    
        /**
         * Base Case: When string length equals to one;
         * Recursive Case: When string length two or more;
         */
        
        if (myStr.isEmpty()){
            System.out.print("");
        }
        
        if (myStr.length() == 1){
            System.out.print(myStr);
        } else {
            char tmp = myStr.charAt(myStr.length()-1);
            System.out.print(tmp);
            String next = myStr.substring(0, myStr.length()-1); //last index is exclusive
            reverseString(next);
        }
        
    }
    
    
    /**
     * QUESTION 4: Calculating the sum of the integer N to 1
     */
    public static int calculateSum(int N){
	if (N == 1){
		return N;
	} else {
		return N + calculateSum(N-1);
	}
    }
    
    
    /**
     * QUESTION 5: Method to return constituent digits of an integer
     */
    public static void printDigit(int N){
        
        if (N < 0) {
            System.out.print("- ");
            N = -N;
        }
        
        if (N < 10){ //base case
            System.out.print(N);
            
        } else { //recursive case
            
            printDigit(N / 10); //reduces the number to one less digit (4567 -> 456)
            System.out.print(" "); //added a space for the next number
            System.out.print(N % 10); //print the end of the integer (4567 -> 7)
        }
    }
}
