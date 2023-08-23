package HefShine.ByPalakMam;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number  : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0)
            System.out.println(n+" is Even Number .");
        else
            System.out.println(n+" is Odd Number .");
    }
}
