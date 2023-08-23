import java.util.Scanner;

public class EndingWith7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Start : ");
        int start=s.nextInt();
        System.out.print("Enter End : ");
        int end=s.nextInt();
        System.out.print("Ending with : ");
        int d=s.nextInt();
        for(int i=start;i<end;i++)
        {
            if(i%10==d)
             System.out.print(i+"   ");
        }
    }
}


