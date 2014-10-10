
import java.math.BigInteger;

public class powerDigitSum {
//215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

//What is the sum of the digits of the number 21000?
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        char[] num = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376".toCharArray();
        long sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += (int) (num[i]) - 48;
        }
        System.out.println(sum);
        System.out.println("Run Time: " + (System.currentTimeMillis() - time) + " milliseconds");
    }
}
