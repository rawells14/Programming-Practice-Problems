/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class summationOfPrimes {
    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long summation = 0;
        for (long i = 2; i < 500000; i++) {
            if (isPrime(i)) {
                summation += i;
            }
        }
        System.out.println(summation);
    }
}