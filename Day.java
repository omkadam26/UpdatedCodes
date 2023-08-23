import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter day : ");
        int day=s.nextInt();
        System.out.print("The day is ");
        switch(day)
        {
            case 1:  System.out.println("Monday");
                     break;        
            case 2:  System.out.println("Tuesday");
                     break;      
            case 3:  System.out.println("wednesday");
                     break;
            case 4:  System.out.println("Thurday");
                     break;
            case 5:  System.out.println("Friday");
                     break;     
            case 6:  System.out.println("Saturday");
                     break;
            case 7:  System.out.println("Sunday");
                     break;
            default:
                System.out.println("Enter day in range of 0-7.....");

        }
    }
}
