package HefShine.ByPalakMam;
import java.util.Scanner;

import java.lang.Math;

public class CompountIntrest {
    public static void main(String[] args) {
        //program for the compound interst
        System.out.println("---------------  COMPOUND INTEREST ---------------");
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Principle Amount________ : ");
        int p=s.nextInt();                                          //principle amount.
        System.out.print("Enter the rate of Intrest(like 0.05 )________ : ");
        float r=s.nextFloat();                                       //rate of intrest
        System.out.print("Enter the Months : ");
        int n=s.nextInt();
        System.out.print("Enter the Year for which the rate of Intrest: ");  //Months to Calculate
        int t=s.nextInt();                                                     //year

        //compound Inrest formula Amount=p(1+(r/n))^(n*t);

        double fPart=(1+(r/n));
        int sPart=(n*t);
        float Amount=(float)(p*Math.pow(fPart, sPart));
        System.out.println("_____________________________________________________");
        System.out.println();
        System.out.println("And the Final Amount of your Transaction is : "+Amount);

        
        
    }
}
