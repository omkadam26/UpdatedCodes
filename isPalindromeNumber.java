import java.util.Scanner;

public class isPalindromeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number _____  ");
        int num=s.nextInt(),sum=0,rem=0;
        int temp=num;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.print(sum);
        if(sum==temp)
            System.out.println(" Palindrome NUmber");
        else 
            System.out.println(" Not Palindrome NUmber");
    }
}
