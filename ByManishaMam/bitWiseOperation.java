package HefShine.ByManishaMam;

import java.util.Scanner;

public class bitWiseOperation {
    public static void main(String[] args) {
        int a=0b1111;
        int b=0b1001;        
        System.out.println("The Value of a and b are  "+a+" & "+b);
        
        int bitwiseAND=a&b;
        int bitwiseOR=a|b;
        int bitwiseXOR=a^b;
        System.out.println("Result of BitwiseAND is _____ "+bitwiseAND);
        System.out.println("Result of BitwiseOR is _____ "+bitwiseOR);
        System.out.println("Bitwise AND in Binary _______ "+Integer.toBinaryString(bitwiseAND));
        System.out.println("Result of BitwiseXOR is _____ "+bitwiseXOR);
        System.out.println("Bitwise XOR _______  "+Integer.toBinaryString(a));
       
        

        //and to convert the integer into the binary number



        
    }
}
