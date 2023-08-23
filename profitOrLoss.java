import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Cost price and then selling price:");
        int cP=s.nextInt();
        int sP=s.nextInt();
        if(sP > cP)
            System.out.println("Profit.");
        else
            System.out.println("Loss");
    }
}
