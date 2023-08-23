
import java.util.Scanner;
public class CountDIgit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENter a number ____ ");
        int n=s.nextInt();
        String str=String.valueOf(n);
        System.out.println("THe number of digit is "+str.length());
    }
}
