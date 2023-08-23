package HefShine.ByManishaMam;
import java.util.Scanner;
public class BitwiseOp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Two numbers on which bitwise operation is to be perform_______ : ");
        int a=s.nextInt();
        int b=s.nextInt();
        int bitwiseAND=a&b;
        int bitwiseOR=a|b;
        int bitwiseXOR=a^b;
        System.out.println("Result of BitwiseAND is _____ "+bitwiseAND);
        System.out.println("Result of BitwiseOR is _____ "+bitwiseOR);
        System.out.println("Result of BitwiseXOR is _____ "+bitwiseXOR);

    }
    
}
