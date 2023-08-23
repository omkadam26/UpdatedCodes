package Patterns;
/*

F E D C B A 
F E D C B 
F E D C 
F E D 
F E 
F 
F E 
F E D 
F E D C 
F E D C B 
F E D C B A


*/
public class Pattern32 {
    public static void main(String[] args) {
        char ch='F';
        for(int i=5;i>=0;i--)
        {
            ch='F';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch--+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            ch='F';
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch--+" ");
            }
            System.out.println();
        }
    }
}
