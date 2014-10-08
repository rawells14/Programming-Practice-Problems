
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class largeSum {

    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
        try {
            Scanner asdf = new Scanner(new File("largeSumData.txt"));
            while (asdf.hasNextLine()) {
                sum  = sum.add(new BigInteger(asdf.nextLine()));
                System.out.println(sum);
            }

            System.out.println(sum);



        } catch (FileNotFoundException ex) {
            Logger.getLogger(largeSum.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
