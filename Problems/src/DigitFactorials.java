public class DigitFactorials {

    public static void main(String[] args) {
        int tot = 0;
        for (long i = 0; i < 1000000000; i++) {
            if (isCurious(i)) {
                System.out.println(i);
                tot += i;
            }
        }
    }

    public static boolean isCurious(long n) {
        char data[] = Long.toString(n).toCharArray();
        long tot = 0;
        for (int i = 0; i < data.length; i++) {
            tot += fact(data[i] - 48);
        }
        return n == tot;
    }

    public static int fact(int n) {
        int tot = 1;
        for (int s = n; s > 1; s--) {
            tot *= s;
        }
        return tot;
    }

}
