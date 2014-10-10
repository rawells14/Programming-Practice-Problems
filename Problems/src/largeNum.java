
import java.math.BigInteger;

public class largeNum {

    public static void main(String[] args) {
        BigInteger num = new BigInteger("100");
        BigInteger res = new BigInteger("1");
        while (!num.equals(BigInteger.ZERO)) {
            res = res.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }

        System.out.println(res);
    }
}
