package HefShine.ByPalakMam;
import java.util.Scanner;

public class greaterFrom2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Numbers is to be checked : ");
        int a=s.nextInt();
        int b=s.nextInt();
        if(a>b)
        {
            System.out.println(a+" Is greater number");
        }else if(b>a)
        {
            System.out.println(b+" is Greater");
        }
        else if(a==b)
        {
            System.out.println(a+b+" Both are equal");
        }

    }
}
