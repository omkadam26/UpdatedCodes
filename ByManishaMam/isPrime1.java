public class isPrime1 {
    public static void main(String[] args) {
        
    
    for (int i = 20; i <= 50; i++) {
        boolean isPrime = true;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(i + " is a prime number.");
        } else {
            System.out.println(i + " is not a prime number.");
        }
    }
}
}
