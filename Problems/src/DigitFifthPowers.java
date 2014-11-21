public class DigitFifthPowers {

    public static void main(String[] args) {
        long tot = 0;
        for (int i = 10; i < 10000000; i++) {
            if (isValidPower(i)) {
                System.out.println(i);
                tot+=i;
            }
        }
        System.out.println(tot);
    }

    public static boolean isValidPower(int n) {
        char data[] = Integer.toString(n).toCharArray();
        int tot = 0;
        for (int i = 0; i < data.length; i++) {
            tot += Math.pow(data[i] - 48, 5);
        }
        return tot == n;
    }

}
