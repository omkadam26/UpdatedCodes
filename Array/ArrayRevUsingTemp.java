package Array;

public class ArrayRevUsingTemp {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80};
        int i=0;
        int j=a.length-1;
        int temp=0;
        while(i<j)
        {
            temp=a[i];
            a[j]=a[i];
            a[j]=temp;
            i++;
            j--;
        }
        for(int x=0;x<a.length;x++)
        {
            System.out.println(a[x]);
        }
    }
}
