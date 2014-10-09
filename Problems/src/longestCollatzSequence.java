
public class longestCollatzSequence {

    public static void main(String[] args) {
        long largest = 0;
        long largestnum = 0;
        long time = System.currentTimeMillis();
        System.currentTimeMillis();
        for (int i = 1000000; i>=2; i--) {
            if (sequence(i) > largest) {
                largest = sequence(i);
                largestnum =i;
            }

        }
        System.out.println(largest);
        System.out.println(largestnum);
        System.out.println("Run Time: " + (System.currentTimeMillis() - time) + " milliseconds");
    }

    

    public static long sequence(long n) {
        long amt = 1;
        while (true) {
            if (n == 1) {
                return amt;
            }
            if (n % 2 == 0) {
                n /= 2;
                amt++;
            } else if (n % 2 != 0) {
                n = (3 * n) + 1;
                amt++;
            }
        }
    }
}
