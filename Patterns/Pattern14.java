package Patterns;

import java.util.Scanner;

/*
Enter _ 5
    *****
     ****
      ***
       **
        *
 */ 
public class Pattern14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter  _  ");
        int n=s.nextInt();
      
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
