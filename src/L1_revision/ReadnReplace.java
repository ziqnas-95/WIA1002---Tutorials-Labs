/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1_revision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Haziq Nasaruddin
 */
public class ReadnReplace {
    
    public static void main(String[] args) {
        
        replacing("text1.txt");
        replacing("text2.txt");
        replacing("text3.txt");
        replacing("text4.txt");
                
    }
    
    //must use double bufferedReader which are used differently
    public static int countLine(String filename){
        
        int lineCount = 0;
        try (BufferedReader RFF = new BufferedReader(new FileReader(filename))){
            
            //line count to declare an array
            while(RFF.readLine() != null){
                lineCount++;
            }
            
        } catch (IOException e){
                System.out.println("Problem in accessing file");
        }
        return lineCount;
    }
    
    //replacing the special characters
    public static void replacing(String filename){
            
        try (BufferedReader RFF = new BufferedReader(new FileReader(filename))){
            
            int size = countLine(filename);
            
            //declare an array
            String[] change = new String[size];
            String line;
            int i = 0;
            while((line = RFF.readLine()) != null){
                change[i] = line;
                i++;
            }
            RFF.close();
            
            if (filename.equalsIgnoreCase("text4.txt")){
                
                for (int j = 0; j < change.length; j++){
                                       
                    String original = change[j];
                    String neworg = original.replaceAll("\\d","");
                    change[j] = neworg;
                }
            
            } 
            else {
                
                //replace special characters
                for (int j = 0; j < change.length; j++){
                    String original = change[j];
                    String neworg = original.replace(",","").replace(" ","").replace(";","");
                    change[j] = neworg;
                }
                
            }
            
            //count number of characters
            int numChar = 0;
            for (String e : change){
                numChar += e.length();
            }
            System.out.println("File Name           : " + filename);
            System.out.println("Number of lines     : " + size);
            System.out.println("Number of characters: " + numChar + "\nText:");
            
            //print the file
            for (String e : change){
                System.out.println(e);
            }
            System.out.println("\n");
               
        } catch (IOException e){
                System.out.println("Problem in accessing file");
        }
    
    }
    
}
