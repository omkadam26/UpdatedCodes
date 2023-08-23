import java.util.Scanner;

public class iskaprekarByPalakMam {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number _______ ");
        int num=s.nextInt();
        int sq=num*num;
        int temp=sq;
        int cntDigits=0;
        boolean isKaprekarNumber=false;
        while(temp>0)
        {
            temp/=10;
            cntDigits++;
        }
        for(int i=1;i<cntDigits;i++)
        {
                int divisor=(int)Math.pow(10, i);
                int q=sq/divisor;
                int rem=sq%divisor;
                if(q+rem==num)
                {
                    isKaprekarNumber=true;
                }
        }
        if(isKaprekarNumber)
          System.out.println(num+" is kaprekar Number");
        else 
         System.out.println(num+" is not Kaprekar Number");
    }
}
