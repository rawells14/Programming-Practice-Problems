
public class recipricolscycles {

    public static void main(String[] args) {
        double f = 1.0 / 8;
        System.out.println(f);
        for (double i = 0.0; i < 1000.0; i++) {
            double num = 1.0 / i;
            System.out.print(i + ":  ");
            System.out.println(num);
            System.out.println("Length:  " + Double.toString(num).length());
        }
    }
}
