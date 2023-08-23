import java.util.Scanner;
public class harshadNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number ___ ");
       int num=s.nextInt();
       int sum=0,input=num,digit;
       while(num!=0)
       {
        digit=num%10;
        sum+=digit;
        num/=10;
       }
       System.out.println("Sum of Digit is : "+sum);
       if(input%sum==0)
        System.out.println("Given Number is Harshad Number");
    else 
    System.out.println("Given Number is not harshad Number");
    }
}
