import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.print("ENter Base _ ");
        Scanner s=new Scanner(System.in);
        int base=s.nextInt();
        System.out.print("Enter Exponent _ ");
        int exp=s.nextInt();
        int pow=1;
        for(int i=1;i<=exp;i++)
        {
            pow=pow*base;
        }
        System.out.println(pow);
        System.out.println((int)Math.pow(base, exp));
    }
}
