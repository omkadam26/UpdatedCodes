import java.util.Scanner;

public class EvenOddFromGivenRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Start _ ");
        int start=s.nextInt();
        System.out.print("Enter End _ ");
        int end=s.nextInt();
        System.out.print("Even Number: ");
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
              System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Odd NUmbers : ");
        for(int i=start;i<=end;i++)
        {
            if(i%2!=0)
              System.out.print(i+" ");
        }
    }
}
