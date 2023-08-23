package HefShine.ByPalakMam;

import java.util.Scanner;

public class Scanner1 {
     public static void main(String[] args) {
        System.out.print("Enter Number ___ " );
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        System.out.println("Entered  number is " +i);
        s.close();
    }
}
