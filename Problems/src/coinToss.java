
import java.util.Scanner;
//Ryan Wells
public class coinToss {

    public static void main(String[] args) {
        int total = 8;
        int h   ;
        int t = 0;
        Scanner asdf = new Scanner(System.in);
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t += asdf.nextLine().charAt(0) % 104;
        t = t / 12;
        h = 8 - t;
        System.out.println("Number of Heads:   " + h);
        System.out.println("Number of Tails:    " + t);
        System.out.println("Percent of heads:   " + ((double) h / total) * 100 + "%");
        System.out.println("Percent of tails:   " + ((double) t / total) * 100 + "%");
    }
}
