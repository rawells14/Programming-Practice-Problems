
public class amicableNumbers {

    public static void main(String[] args) {
        System.out.println(d(220    ));
    }

    public static int d(int n) {
        int sumOfDivisors = 0;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    }
}
