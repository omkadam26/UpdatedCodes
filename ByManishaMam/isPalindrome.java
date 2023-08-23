
import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ______ ");
        int num=s.nextInt();
        int num1=num;
        int rev=0;
        int rem=0;
        for(rev=0;num!=0;rev++)
        {
            
            rem=num%10;
            num/=10;
            rev=rev*10+rem-1;
            
        }
        System.out.println();
       if(rev==num1)
         System.out.println(num1+" is palindrome number.");
       else
         System.out.println(+num1+" is  not palindrome number.");
        
         System.out.println();
    }
}

