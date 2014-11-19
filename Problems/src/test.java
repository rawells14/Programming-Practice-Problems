import java.util.Scanner;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        System.out.println("Enter Number: ");
        Long num = asdf.nextLong();
        System.out.println("Enter base to change number to: ");
        int base = asdf.nextInt();
        System.out.println(Long.toString(num, base));
    }

}
