
/**
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class tenThousandFirstPrime {

    public static void main(String[] args) {
        int count = 1;
        int amtOfPrimes = 0;
        while (amtOfPrimes != 10001) {
            count++;
            if (isPrime(count)) {
                amtOfPrimes++;
            }

        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        for (int i = n - 1; i >= 2; i--) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
