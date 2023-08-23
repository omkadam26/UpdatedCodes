package Patterns;
/*
        0   1   2   3   4 
    0   *   *   *   *   *
    1   *   *   *   *   *
    2   *   *   *   *   *
    3   *   *   *   *   *
    4   *   *   *   *   *


 */
public class Pattern10 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=4;col++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
