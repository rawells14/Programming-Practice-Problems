
public class amicableNumbers {

    public static double Timer(double started) {
        return System.currentTimeMillis() - started;
    }

    public static void main(String[] args) {
        double time = System.currentTimeMillis();
        int tot = 0;
        System.out.println(d(8128));
        for (int i = 30; i < 10000; i += 2) {
            for (int j = 30; j < 10000; j += 2) {
                if (i != j) {
                    if (d(i) == j && d(j) == i) {
                        System.out.println(i + "  " + j);
                        i = j;
                        tot += i + j;
                    }
                }
            }

        }
        System.out.println(tot);
        System.out.println("Run Time: " + Timer(time) / 1000 + " seconds");
    }

    public static int d(int n) {
        int sumOfDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    }
}
