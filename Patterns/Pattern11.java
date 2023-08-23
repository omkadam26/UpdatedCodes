package Patterns;
/*
        1   2   3   4   5
    1   *
    2   *  *
    3   *   *   *
    4   *   *   *   *
5   *   *   *   *   *   *

 */
public class Pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
