import java.util.ArrayList;

public class practice {

    public static void main(String[] args) {
        System.out.println(getFactors(10));
    }

    public static int getGCD(int a, int b) {
        ArrayList<Integer> factora = getFactors(a);
        ArrayList<Integer> factorb = getFactors(b);
        while (true) {
            
        }
    }

    public static ArrayList<Integer> getFactors(int n) {
        ArrayList<Integer> factors = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

}
