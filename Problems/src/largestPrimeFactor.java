
public class largestPrimeFactor {

    public static void main(String[] args) {
        long num = 600851475143l;
        for (long i = 3; i<num-2; i = i =i+2) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(long n) {
        if (n % 2 == 0) {
            return false;
        }
        for (long i = (long) (Math.sqrt(n) + 1); i > 2; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
