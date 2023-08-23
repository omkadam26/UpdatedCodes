public class RightShiftOnArray {
    public static void main(String[] args) {
        int a[]={2,4,5,6,7,19,9};
        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
