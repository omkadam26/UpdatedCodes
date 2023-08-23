package HefShine.ByPalakMam;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("ENTER PRINCIPLE_AMOUNT(p)  RATE OF INTREST(r) Time Duration (t) ");
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int r=s.nextInt();
        int t=s.nextInt();
        System.out.println("The Simple Intrest is "+((p*r*t)/100));
    }
}
