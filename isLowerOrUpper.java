import java.util.Scanner;

public class isLowerOrUpper {
    public static void main(String[] args) {
         Scanner s=new Scanner (System.in);
        System.out.println("Input ______ : ");
        ch c=s.next();
        if(c >= 'A' && c <='Z')
            System.out.println("Uppercase Letter.");
        else if(c >= 'a' && c <='z')
            System.out.println("Lowercase Letter.");
        else
            System.out.println("Symbol.");
    }
}
