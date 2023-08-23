public class StoreEvenNdOddinArray {
    public static void main(String[] args) {
        
        int a[]={10,20,30,40,50,60,70,80};
        int b[]={};
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            if(a[i]%2==0)
                b[i]=a[i];
           i++;
           j--;
        }
        // for(int k:a)
        // {
        //     System.out.print(k+" ");
        // }
        for (int x : b) {
            System.out.print(x+" ");
        }
    }
}
