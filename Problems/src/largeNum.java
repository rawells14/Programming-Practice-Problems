
import java.math.BigInteger;

public class largeNum {

    public static void main(String[] args) {
        BigInteger num = new BigInteger("1");
        for (int i = 0; i < 1000; i++) {
            num = num.multiply(new BigInteger("2"));
        }

        System.out.println(num);
    }
}
