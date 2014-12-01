public class CircularPrimes {

    public static void main(String args[]) {
        cycle(1234567);
    }

    public static int cycle(int n) {
        String s = Integer.toString(n);
        String temp = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            
        }
        return n;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
