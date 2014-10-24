
import java.math.BigInteger;

public class fiboTest {

    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        BigInteger sum = new BigInteger("2");
        for (int i = 1; i < 100; i++) {
            BigInteger temp = num1;
            num1 = num2;
            num2.add(temp);
            
            sum.add(num1);
            sum.add(num2);
            System.out.println(sum);
        }
    }
}
