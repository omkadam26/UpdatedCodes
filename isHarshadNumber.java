/*Write a program to check whether a number is a Harshad Number or not.
In recreational mathematics, a harshad number in a given number base,
 is an integer that is divisible by the sum of its digits when written in that base.
Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) 
and 200 is divisible by 
2.
Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9
 */

import java.util.Scanner;

public class isHarshadNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int sum=0;
        int cnt=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
            cnt++;
        }
        System.out.println("And The Digits present in Number is : "+cnt);
        System.out.println("Sum of Digits : "+sum);

        if(temp%sum==0)
           System.out.println(temp+" is Harshad NUmber.");
        else
            System.out.println(temp+" is Not Harshad NUmber.");
    }
}
