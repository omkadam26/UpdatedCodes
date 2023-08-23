import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("input Marks _____________ : ");
        int result=s.nextInt();
        String Status=(result>=45) ? "Congrtsn you are  Pass" : "Sorry you are  Fail";
        System.out.println(Status);
    }
}
