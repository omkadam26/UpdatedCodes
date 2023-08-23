import Array.forEachDemo;

public class EvenOddOnArray
{
    public static void main(String[] args) {
        int a[]={2,7,9,5,10,12};
        int b[]=new int[a.length];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
                b[index++]=a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
                b[index++]=a[i];
        }
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }

}