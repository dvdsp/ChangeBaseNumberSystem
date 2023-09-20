/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static common.Convert.convertBinToDec;
import static common.Convert.convertBinToHexa;
import static common.Convert.convertDecToBin;
import static common.Convert.convertDecToHexa;
import static common.Convert.convertHexaToBin;
import static common.Convert.convertHexaToDec;
import common.Validate;

/**
 *
 * @author DELL
 */
public class Manager {
    
    
    public static int menu(){
        System.out.println("        MENU        ");
        System.out.println("[1].Convert from binary");
        System.out.println("[2].Convert from decimal");
        System.out.println("[3].Convert from hexadecimal");
        System.out.println("[4].Exit");
        System.out.print("Enter choice:     ");
        int choice = Validate.checkInputChoice(1,4);
        return choice;
    }
    
    public static int convertTo (String from, String case1, String case2 ) {
        System.out.println("1. Convert from "+ from + " to " + case1);
        System.out.println("2. Convert from "+ from + " to "+ case2);
        System.out.println("Enter choice:   ");
        int choice = Validate.checkInputChoice(1, 2);
        return choice;
    }
    
    
    
    // doi tu Binary 
    public static void convertFromBinary ( String binary) {
        int choice = convertTo("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1: System.out.println("Decimal: " + convertBinToDec(binary) );  break;
            case 2: System.out.println("Hexadecimal: "+ convertBinToHexa(binary) ); break;  
        }
    }
    // doi tu decimal
    public static void convertFromDecimal (String decimal) {
        int choice = convertTo("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1: System.out.println("Binary: "+convertDecToBin(decimal) ); break;
            case 2: System.out.println("Hexadecimal: "+ convertDecToHexa(decimal)); break;
        }
    }

    public static void convertFromHexadecimal (String hexadecimal) {
        int choice = convertTo("hexadecimal", "binary", "decimal");
        switch (choice) {
            case 1: System.out.println("Binary: "+convertHexaToBin(hexadecimal) ); break;
            case 2: System.out.println("Decimal: "+ convertHexaToDec(hexadecimal)); break;
        }
    }
  
    
    
    
    
    
    
    
    
    
        
}