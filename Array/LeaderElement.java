package Array;

public class LeaderElement {
    public static void main(String[] args) {
        int a[]={1,15,13,4,5};
        System.out.print("The Leader Elements are : ");
        for(int i=0;i<a.length;i++)
        {   int cnt=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                    cnt++;
            }
            if(cnt==0)
                System.out.print(a[i]+" ");
        }
    }
}

//LesserElement
