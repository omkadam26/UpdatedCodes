import java.util.Scanner;
public class kaprekarNumberUsingDoWhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number _______  ");
        int num=s.nextInt();
        int left=1,sum=0,right=0,d=1,square=0;
        boolean Kaprekar=false;  
        square=num*num;
        do{
            d*=10;
            right=square%d;
            left=square/d;
            sum=left+right;
            if(sum==num)
            {
                Kaprekar=true;
                break;
            }
            
        }
        while(left!=0);
        
        if(Kaprekar)
         System.out.println(num+" is kaprekar Number .");
        else
         System.out.println(num+" is not Kaprekar Number.");
    

    }
}
