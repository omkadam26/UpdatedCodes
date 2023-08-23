package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15,16,17,18,19,20};
        int element=20;
      
        int first=0;
        int last=a.length-1;
        int mid;

        while(true)
        {
            mid=(first+last)/2;
            if(element==a[mid])
            {
                System.out.println("Element found at index : "+mid+1);
                break;
            }
            else if(element>a[mid])
            {
                first=mid+1;
            }
            else                    //else if(element<a[mid])
            {
                last=mid-1;
            }
            
            if(last<first){
            System.out.println("Not Found .");
            break;
        }

        }
       
    }
}
