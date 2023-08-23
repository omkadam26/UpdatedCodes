
import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input the Number____________  ");
        int numOfDays=s.nextInt();
        System.out.println("Total NUmber of Given days :"+numOfDays);
        int year=numOfDays/365;
        System.out.println("year : "+year);
        int rem1= numOfDays%365;
        int month=rem1/30;
        System.out.println("Month: "+month);
        int rem2=rem1%30;
        
        int week =rem2/7;
        System.out.println("week : "+week);

        int days=rem2%7;
        System.out.println("days : "+days);
    }
}
