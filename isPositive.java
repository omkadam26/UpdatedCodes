import java.util.Scanner;

public class isPositive {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Input ___________ : ");
        int n=s.nextInt(); 
        if(n>0)       
            System.out.println(n+" is Positive.");
        else if(n<0)       
            System.out.println(n+" is Negative.");
        else if (n==0)  
            System.out.println(" The Number is Zero.");
        
    }
}
