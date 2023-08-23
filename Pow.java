import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=s.nextInt();
        System.out.print("Enter Power : ");
        int n1=s.nextInt();
        int result=0;
        for(int i=n;i<=n1;i++)
        {
            result=i*i;
        }
       
        System.out.println(n1+"th power of "+n+" is "+result);
       
    }
}
//6*4=1296;
