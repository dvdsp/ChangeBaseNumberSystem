/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Validate {
    private static final String Binary_Valid = "[0-1]*";
    private static final String Decimal_Valid = "[0-9]*";
    private static final String Hexadecimal_Valid = "[0-9A-F]*";
    
    
    // kiem tra lua chon tu nguoi dung
    public static int checkInputChoice (int min, int max){
        while (true) {
            try{
                int result = Integer.parseInt(new Scanner(System.in).nextLine().trim());
                if(result < min || result > max){
                    throw new NumberFormatException();
                }
                return result;
            }catch (NumberFormatException e) {
                System.out.format("Please, enter number in range %d - %d\n", min, max);
                System.out.print("Let's try enter again:      ");
            }
        }
    }
    
    
    
    
    // kiem tra nguoi dung nhap co  co hop le khong
    public static String checkInputBinary (){
        System.out.println("Enter binary number:   ");
        String result;
        while (true){
            result = new Scanner(System.in).nextLine().trim();
            if( result.matches(Binary_Valid) ) {
                return result;
            }
            System.err.println("Tip: Binary valid is 0 or 1");
            System.out.println("Let's enter again : ");
        }
    }
    
    public static String checkInputDecimal (){
        System.out.println("Enter decimal number:   ");
        String result;
        while (true) {
            result = new Scanner(System.in).nextLine().trim();
            if ( result.matches(Decimal_Valid) ) {
                return result;
            }
            System.out.println("Tip: Decimal valid is 0 - 9");
            System.out.println("Let's enter again : ");
        }
    }
    
    public static String checkInputHexadecimal (){
        System.out.println("Enter hexadecimal:  ");
        String result;
        while (true){
            result = new Scanner(System.in).nextLine().trim();
            if (result.matches(Hexadecimal_Valid) ){
                return result;
            }
            System.out.println("Tip: Hexadecimal in range [0,..,9,A,..,F]");
                System.out.println("Let's enter again :  ");
        }
    }
    
    
    
    
    
    
}
