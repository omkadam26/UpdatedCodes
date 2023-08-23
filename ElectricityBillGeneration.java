import java.util.Scanner;

public class ElectricityBillGeneration {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Units ____ ");
        int units=s.nextInt();
        float totalBill,tbill=0,surcharges=0;
        if(units<=50)
        {
            tbill=units*0.50f;
        }else if(units<=150)
        {
            tbill=50*0.50f+(units-50)*0.75f;
        }else if(units<=250)
        {
                tbill=50*0.50f+100*0.75f+(units-50)*0.75f;
        }else if(units>=250)
        {
            tbill=50*0.50f+100*0.75f+100*1.20f+(units-250)*1.50f;
        }
        else{
            
        }
       // System.out.println("Bill : "+tbill);
        surcharges=tbill*0.20f;
        totalBill=tbill+surcharges;
        System.out.println("Total Bill have to Pay is  : "+(double)(totalBill));
    }
}
