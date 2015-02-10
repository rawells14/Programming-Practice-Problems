public class CircularPrimes {

    public static void main(String args[]) {
        int amt = 0;
        for (int i = 0; i < 10; i++) {
            
        }
    }

    public static int cycle(int n) {
        String s = Integer.toString(n);
        String temp = s.substring(0, 1);
        s = s.substring(1, s.length());
        s = s + temp;
        
        return Integer.parseInt(s);
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
