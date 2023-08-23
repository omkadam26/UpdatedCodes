import java.util.Scanner;

public class isLeap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A year ____ ");
        int year=s.nextInt();
        if((year%4==0)&&((year%100 !=0)||(year%400==0)))
            System.out.println(year+" is Leap Year.");
        else
            System.out.println(year+" not Leap Year.");
    }
}
