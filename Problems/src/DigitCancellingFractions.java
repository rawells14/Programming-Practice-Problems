public class DigitCancellingFractions {

    public static void main(String[] args) {

        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {

                if (i < j) {
                    isCurious(i, j);
                }
            }
        }
    }

    public static boolean isCurious(int n, int d) {
        String numerator = Integer.toString(n);
        String denominator = Integer.toString(d);
        String cancel1 = Integer.toString(n).substring(0, 1);
        String cancel2 = Integer.toString(n).substring(1, 2);
        if (numerator.contains(cancel1) && denominator.contains(cancel1)) {
            String temp = numerator.replaceAll(cancel1, "");
            String temp2 = denominator.replaceAll(cancel1, "");
            if (temp.length() == 0 || temp2.length() == 0) {
                return false;
            }
            if (Integer.parseInt(temp) / Integer.parseInt(temp2) == n / d) {
                System.out.println(n + " / " + d);
                return true;
            }
        }

        return false;
    }

}
