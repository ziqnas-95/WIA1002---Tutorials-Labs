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
        
        System.out.println(sum(5));
        reverseString2("My name is Muhammad Haziq bin Nasaruddin");
        System.out.println(" ");
        System.out.println(reverseString1("String"));
        printDigit(-4567);
        
    }
    
    /**
     * QUESTION 3: Reversing a String 
     */
    public static String reverseString1(String myStr){
    
        /**
         * Base Case: When string length equals to one;
         * Recursive Case: When string length two or more;
         */
        if (myStr.length() == 1){
            return myStr;
        } else {
            return reverseString1(myStr.substring(1)) + myStr.charAt(0); 
            //recurse the method first then only print out the back one.
        }
        
    }
    
    public static void reverseString2(String myStr){
    
        /**
         * Base Case: When string length equals to one.
         * Recursive Case: When string length two or more.
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
            reverseString2(next);
        }

    }
    
    
    /**
     * QUESTION 4: Calculating the sum of the integer N to 1
     */
    public static int sum(int N){
	if (N == 1){
		return N;
	} else {
		return N + sum(N-1);
	}
    }
    /**
     * Solution Tracer:
     * sum(5) = 5 + sum(4)
     *        = 5 + 4 + sum(3)
     *        = 5 + 4 + 3 + sum(2)
     *        = 5 + 4 + 3 + 2 + sum(1)
     *        = 5 + 4 + 3 + 2 + 1
     */
    
    
    
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

/**
 * QUESTION 1:
 * The problem is that there is no base case for when the argument is equals to 0.
 * Causes the method to go into an infinite loop (infinite recursion).
 * 
 * QUESTION 2: 
 * The problem is that no argument is being given to the method.
 * The method could not be executed.
 * 
 */