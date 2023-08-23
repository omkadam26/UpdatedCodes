
import java.util.Scanner;

public class isPrime10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ____ ");
        int n=s.nextInt();
        boolean isPrime=false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
             isPrime=true;
             break;
            }
        }
        if(isPrime==true)
            System.out.println(n+" is not prime");
        else
            System.out.println(n+" is Prime");
        
    }
}

//Assume number is given n=2
// n=4
// power of number
// 2*2*2*2

