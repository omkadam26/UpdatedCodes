import java.util.Scanner;

public class isKaprekarUsingFor {
    public static void main(String[] args) {
        int left=1,sum=0,right=0,d=0,square=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=s.nextInt(); 
        boolean Kaprekar=false;  
        square=num*num;
        for(d=1;left!=0;d*=10)
        {
            right=square%d;
            left=square/d;
            sum=left+right;
            if(sum==num)
            {
                Kaprekar=true;
                break;
            }
            
        }
        if(Kaprekar)
        System.out.println(num+" is kaprekar Number");
        else
        System.out.println(num+" is not kaprekar Number");
    }
}
