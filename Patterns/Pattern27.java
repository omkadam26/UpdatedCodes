package Patterns;
/*

A A A A A 
B B B B 
C C C 
D D 
E 


*/
public class Pattern27 {
    public static void main(String[] args) {
        char c='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}
