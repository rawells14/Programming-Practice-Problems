public class CircularPrimes {

    public static void main(String args[]) {
        int amt = 0;
        label1:
        for (int i = 0; i < 100; i++) {
            String n = Integer.toString(i);
            int num = i;
            boolean isCircular = true;
            for (int j = 0; j < n.length(); j++) {
                if (!(isPrime(num))) {
                    break label1;
                }
                num = cycle(num);
            }
            amt++;
        }
        System.out.println(amt);
    }

    public static int cycle(int n) {
        String s = Integer.toString(n);
        String temp = s.substring(0, 1);
        s = s.substring(1, s.length());
        s += temp;
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
