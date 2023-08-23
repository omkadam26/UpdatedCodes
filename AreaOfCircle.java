
import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Redius ______ ");
        double r=s.nextDouble();
        System.out.println("The Area of Circle is "+(Math.PI*(r*r)));;
    }
}
