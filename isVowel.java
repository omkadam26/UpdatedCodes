import java.util.Scanner;
public class isVowel {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Input ______ : ");
        String str=s.next();
        str=str.toLowerCase();
        if(str=="a"||str=="e"||str=="i"||str=="o"||str=="u")
            System.out.println(str+" is Vowel");
        else
         System.out.println(str+"consonant");
    }
}
