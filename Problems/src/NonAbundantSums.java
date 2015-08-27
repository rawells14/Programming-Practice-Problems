public class NonAbundantSums {

    public static void main(String args[]) {
        long total = 0;

        for (long i = 2; i < 28000; i++) {
            if (isNotSumOfAbundant((int) i)) {
                total += i;
            }
            if (i % 1000 == 0) {
                System.out.println(i + "th iteration");
            }

        }
        System.out.println(total);
    }

    public static boolean isAbundant(long n) {
        int total = 1;
        for (int i = 12; i < (long) (Math.sqrt(n) + 1); i++) {
            if (n % i == 0) {
                total += i;
                total += n / i;
            }
            if (total > n) {
                return true;
            }
        }
        return total > n;
    }

    public static boolean isNotSumOfAbundant(int n) {
        int placeholder = n - 2;
        for (int i = 2; i < n; i++) {

            if (isAbundant(i) && isAbundant(placeholder)) {
                return false;
            }
            if (i > placeholder) {
                return false;
            }

            n--;
        }
        return true;
    }

}
