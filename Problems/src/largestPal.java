import java.util.Scanner;

public class largestPal {

    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        int largest = 0;
        double time = System.currentTimeMillis();
        for (int i = 999; i > 500; i=i-2) {
            for (int j = 999; j > 500; j=j-2) {
                if (isPalindrome(i * j) && i * j > largest) {
                    largest = i * j;
                    System.out.println(i * j);
                }
            }
        }
        
        System.out.println("This algorithm took " + (System.currentTimeMillis() - time) + " miliseconds");
    }

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        StringBuilder f = new StringBuilder(s);
        return f.reverse().toString().equals(s);
    }

}
