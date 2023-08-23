public class evenOddPositiveNegativeCount {
    public static void main(String[] args) {
        int a[]={11,22,33,44,55,66,77,88,99};
        int even=0,odd=0,positive=0,neg=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
                if(a[i]>0)
                    positive++;
                else
                    neg++;
    
            }
            if(a[i]%2!=0)
            {
                odd++;
                if(a[i]>0)
                    positive++;
                else
                    neg++;
    
            }
           
        }
         System.out.println("positive numbers : "+positive);
            System.out.println("even numbers "+even);
            System.out.println("odd numbers : "+odd);
            System.out.println("negative : "+neg);
    }
}
