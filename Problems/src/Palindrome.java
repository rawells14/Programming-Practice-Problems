import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner asdf = new Scanner(System.in);
        int amt = asdf.nextInt();
        asdf.nextLine();
        for (int i = 0; i < amt; i++) {
            System.out.println(isPalindrome(asdf.nextLine()) ? "PALINDROME" : "NOT PALINDROME");
        }
    }

    public static boolean isPalindrome(String n) {
        n = n.replaceAll(" ", "");
        StringBuilder f = new StringBuilder(n);
        f = f.reverse();
        return f.equals(n.toString());
    }
}
