package Patterns;
/*

E F G H I 
F G H I 
G H I 
H I 
I 


*/
public class Pattern29 {
    public static void main(String[] args) {
        char c='A';
        for(int i=4;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(c+4+j)+" ");
            }
            System.out.println();
            c++;
        }
    }
}
