public class LyrchelNumbers {

    public static void main(String[] args) {
        int amt = 0;
        label1:
        for (int i = 1; i < 10000; i++) {
            int curNum = getNextLyrchel(i);
            for (int j = 0; j < 49; j++) {
                if (!(isPalindrome(curNum))) {
                    curNum = getNextLyrchel(curNum);
                } else {
                    System.out.println(i);
                    amt++;
                    continue label1;
                }
            }

        }
    }

    public static boolean isPalindrome(int n) {
        return (new StringBuilder(Integer.toString(n))).reverse().toString().equals(Integer.toString(n));
    }

    public static int getNextLyrchel(int n) {
        String s = Integer.toString(n);
        StringBuilder rev = new StringBuilder(s);
        rev = rev.reverse();
        return Integer.parseInt(rev.toString()) + n;
    }

}
