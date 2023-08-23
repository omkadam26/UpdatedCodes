package Array;

public class LeftShift {
    public static void main(String[] args) {
        int a[]={1,15,13,4,5,6,2};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        for(int m:a)
        {
            System.out.print(m+" ");
        }
    }
}
