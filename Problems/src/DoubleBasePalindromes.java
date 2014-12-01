public class DoubleBasePalindromes {

    public static void main(String[] args) {
        int tot = 0;
        for (int i = 1; i < 1000000; i++) {
            String s = Integer.toString(i, 2);
            if (isPalindrome(Integer.toString(i)) && isPalindrome(s)) {
                tot +=i;
            }
            
        }
        System.out.println(tot);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder rev = new StringBuilder(s);
        rev = rev.reverse();
        return rev.toString().equals(s);
    }

}
