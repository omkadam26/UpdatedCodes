package Patterns;
/*

E E E E E 
F F F F 
G G G 
H H 
I 


*/
public class Pattern28 {
    public static void main(String[] args) {
        char c='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)(c+4)+" ");
            }
            System.out.println();
            c++;
        }
    }
}
