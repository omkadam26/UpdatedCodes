package Array;

public class forEachDemo {
        int a[]={10,20,30,76,65,50,34,76};
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[j]=a[i];
            a[j]=temp;
            i++;
            j--;
        }
        for(int k:a)
        {
            System.out.println(k);
        }
}
