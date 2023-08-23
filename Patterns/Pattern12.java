package Patterns;

import java.util.Scanner;

/*

        *****
        ****
        ***
        **
        *

 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter  _  ");
        int n=s.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=5;cols>=rows;cols--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
