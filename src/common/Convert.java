/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author DELL
 */
public class Convert {
    public static final char[] hexaDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                                                                    'A', 'B', 'C', 'D', 'F'  };
    //  nhi phan sang thap phan va thap luc phan 
    public static String convertBinToDec (String binary) {
        int decimal = Integer.parseInt(binary, 2);// chuyen doi cac chuoi bieu dien so trong cac he co so khac nhau sang co so 10 
        return Integer.toString(decimal);
    }
    public static String convertBinToHexa (String binary) {
        String decimal = convertBinToDec(binary);
        String hexadecimal = convertDecToHexa (decimal);
        return hexadecimal;
    }
    public static String convertDecToHexa (String decimal) {
        String hexadecimal = "";
        int dec = Integer.parseInt(decimal);
        // dec chia 16 den khi = 0 dung vong lap
        while (dec != 0) {
            hexadecimal = hexaDigits[ dec % 16 ] + hexadecimal;
            dec = dec / 16;
        }
        return hexadecimal;
    }
    
    
    // thap phan sang nhi phan va thap luc phan 
    public static String convertDecToBin (String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal) );
        return binary;
    }
    
    // thap luc phan sang nhi phan va thap phan 
    public static String convertHexaToBin (String hexadecimal) {
        String binary = Integer.toBinaryString(convertHexaToDec(hexadecimal) );
        return binary;
    }
    public static int convertHexaToDec (String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }
    
    
    
}
