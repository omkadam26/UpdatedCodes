package HefShine.ByPalakMam;
import java.util.Scanner;
public class PerimeterOfRect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Length and Breadth of Reactangle to find Area and Perimeter of Reactangle __ ");
        int length=s.nextInt();
        int breadth=s.nextInt();
        System.out.println("THe Area of React is "+(length*breadth));
        System.out.println("THe Perimeter of React is "+(2*(length+breadth)));
    }
}
