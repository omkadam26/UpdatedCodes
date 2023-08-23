

public class ArrayRevWithoutThird {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80};
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
           a[i]=a[i]+a[j];
           a[j]=a[i]-a[j];
           a[i]=a[i]-a[j];
           i++;
           j--;
        }
        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }
}
