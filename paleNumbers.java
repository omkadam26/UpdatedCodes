public class paleNumbers {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int c;
        System.out.print("0 ");
        for(int i=1;i<10;i++)
        {
            c=a+2*b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
