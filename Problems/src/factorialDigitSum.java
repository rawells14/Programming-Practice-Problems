
public class factorialDigitSum {

    public static void main(String[] args) {
        char[] num = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000".toCharArray();
        long sum = 0;
        for (int i = 0; i < num.length; i++) {
sum+= num[i]-48;
        }
        System.out.println(sum);
    }
}
