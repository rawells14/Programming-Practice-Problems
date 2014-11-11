import java.math.BigInteger;

/*
 The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

 Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 */
public class selfPowers {

    public static void main(String args[]) {
        BigInteger sum = new BigInteger("0");
        for (int i = 1; i <= 1000; i++) {
            sum = sum.add(new BigInteger(i + "").pow(i));
        }

        System.out.println(sum);
    }
}
