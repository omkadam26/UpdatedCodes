public class isPrimeByAk
{
    public static void main(String[] args) {
        for (int i=8; i<=50; i++) {
			int count =0;
			for (int j=2; j<i; j++) 
				
				if (i%j==0)
					count ++;
			
			if (count ==0) {
             System.out.println(i);
             }
	}
    }
}