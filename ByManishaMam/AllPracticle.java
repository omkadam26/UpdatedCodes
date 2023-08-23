import java.util.Scanner;
import java.lang.StringBuilder;

public class AllPracticle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Input  _____ ");
        int test=s.nextInt();
        int result=0;
        result= test>>1;               //rightshift by 1 means divide by 2.
        System.out.println("The value of i After rightShift by 1 : "+result);
        if((test/=2)==result)
            System.out.println("The Result is Confirmed.");
        else
            System.out.println("confirmation is Not Matched.");
        
        
        test<<=1;       
        System.out.println("The Result after LeftShift "+test);
        System.out.println();
        if(test*2==test)
            System.out.println("the Result of Leftshift is now confirmed.");
        else
            System.out.println("LeftShift Result is Not Confirmed.");
        String biResult=convertToBinary(test);      //logic for finding the binary logic 
    
        System.out.println("The Binary of Given NUmber is : "+biResult);

           

    }




    public static String convertToBinary(int decimal) {
            if (decimal == 0) {
                return "0";
            }
    
            StringBuilder binary = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder); 
                decimal /= 2;
            }
    
            return binary.toString();
        }
}
