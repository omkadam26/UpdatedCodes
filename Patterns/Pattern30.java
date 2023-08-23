package Patterns;
/*

F E D C B 
F E D C 
F E D 
F E 
F 


*/
public class Pattern30 {
    public static void main(String[] args) {
        char ch='F';
        for(int i=4;i>=0;i--)
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
