public class SumOfDigits1 {

        public static void main(String[]args)
        {
        int num = 123;
        int sum = 0;
        int rem = 0;
        int count=0;
        
        while(num>0)
        {
        
            rem = num%10;
            sum = sum+rem;
            num = num/10;
            count++;
        }
        System.out.println(sum);
        System.out.println("The Number of Digits within Number : "+count);
        }
        }
