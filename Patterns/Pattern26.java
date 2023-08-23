package Patterns;
/*

A B C D E 
A B C D 
A B C 
A B 
A  


*/
public class Pattern26 {
    public static void main(String[] args) {
        char c='A';
        for(int i=1;i<=5;i++)
        {
            c='A';
            for(int j=5;j>=i;j--)
            {
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
}
