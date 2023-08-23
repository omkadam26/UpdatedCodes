import java.util.Scanner;

public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input : ");
        int n=s.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive and ");
            if(n%2==0)
                System.out.print("Even");
            else
                System.out.print("Odd");
        }
        if(n<0)
            System.out.print(n+" Is Negative & ");
    
    }
}
