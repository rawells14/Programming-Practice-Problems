
import java.util.Scanner;

public class numberLetterCounts {

    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        int tot = 0;
        String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tens[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hundreds[] = {"", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
        String teens[] = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        int num = asdf.nextInt();
        if (num % 100 == 0) {
            tot -= 3;
        }

        if (num >= 100) {
            tot += hundreds[num / 100].length();
            tot += 3;
        }
        if (num >= 10) {
            if (num / 10 % 10 != 1) {
                tot += tens[num / 10 % 10].length();
            } else {
                tot += teens[num / 10 % 10].length();   
            }
        }

        tot += ones[num % 10 % 10].length();

//123
        System.out.println(tot);
    }
}
