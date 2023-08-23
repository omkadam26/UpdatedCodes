package Array;

public class IndexOf {
    public static void main(String[] args) {
        int a[]={10,20,30,40,56,12,89,99,76};
        int element=99;
        int cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==element)
            {
                cnt++;
                System.out.println(element+" is found at "+(i+1));
            }
        } 
        if(cnt==0)
            System.out.println("Element is not found in Given Array");
    }
}
