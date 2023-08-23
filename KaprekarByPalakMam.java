import java.util.Scanner;

public class KaprekarByPalakMam {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);                                       //Scanner class Object Creation.
        System.out.print("Enter Number ___ ");
        int n=s.nextInt();
        int sq=n*n;                                                             //logic to do the Square of Number Entered.
        System.out.println("Square of "+n+" is "+sq);
        System.out.println("================================ "); 
        int rem=0,q=0;    
        boolean isKap=false;  
        for(int i=10;n!=0;i*=10)                                                               //logic for KaprekarNumber.
        {
            rem=n%i;
            q=n/10; 
           if(q+rem==n)
              isKap=true;
        }
        if(isKap)
           System.out.println(n+" is Kaprekar Number");
        else
        System.out.println(n+" is not kaprekar Number");
         
    }
}
