
public class isPalindromeNum {
    public static void main(String[] args) {
        int rev=0;
        int num=121;
        int n1=num;
        int rem=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(rev==n1)
            System.out.println(n1+" is palindrome Number.");
        else
            System.out.println(n1+" is Not palindrome Number.");
        

    }
}
