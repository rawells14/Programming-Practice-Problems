public class quadraticPrimes {

    public static void main(String[] args) {
        double time1= System.currentTimeMillis();
        System.out.println(getQuadForAmt(-79, 1601));
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j < 1000; j++) {

            }
        }
        System.out.println(System.currentTimeMillis()-time1+"  miliseconds to run");
    }

    public static int getQuadForAmt(int a, int b) {
        int amt = 0;
        for (int i = 1; i <= a; i++) {
            if (isPrime((int) (Math.pow(i, 2) + (a * i) + b))) {
                amt++;
            }
        }
        return amt;
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
