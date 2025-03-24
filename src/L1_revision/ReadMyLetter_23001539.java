/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L1_revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Haziq Nasaruddin
 */
public class ReadMyLetter_23001539 {
    
    public static void main(String[] args) {
        
        String filename = "src\\HaziqNasaruddin_23001539.txt";
               
        ReadFromFile(filename);
        AppendToFile(filename);
        ReadFromFile(filename);
        
    }
    
    public static void AppendToFile(String filename){
    
        Scanner scan = new Scanner(System.in);
        
        try(BufferedWriter WTF = new BufferedWriter(new FileWriter(filename,true))){
            
            System.out.println("\nEnter text to write to the file... (type 'exit' to finish):");
            String line;
            WTF.write("\n");
            while (!(line = scan.nextLine()).equalsIgnoreCase("exit")){
                WTF.write(line);
                WTF.newLine();
            }
            
            System.out.println("Content has been written to the file\n");
        }
        catch (IOException e){
            System.out.println("An error occured while reading the file....");
            e.printStackTrace();
        }
        
        scan.close();
    }
    
    public static void ReadFromFile(String filename){
        
        System.out.println("CONTENT OF FILE\n");
        
        try(BufferedReader RFF = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = RFF.readLine()) != null){
                System.out.println(line);
            }
            RFF.close();
        }
        catch (IOException e){
            System.out.println("An error occured while reading the file....");
            e.printStackTrace();
        }
    
    }
    
}



