
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nameScores {

    public static void Timer(double started) {
        System.out.print((System.currentTimeMillis() - started) / 1000+" seconds");
    }

    public static void main(String[] args) throws FileNotFoundException {
        double time = System.currentTimeMillis();
        Scanner asdf = new Scanner(new File("names.txt"));
        String data[] = asdf.nextLine().replaceAll("\"", "").split(",");
        ArrayList<String> arr = new ArrayList();
        for (int i = 0; i < data.length; i++) {
            arr.add(data[i]);
        }
        Collections.sort(arr);
        Timer(time);
        System.out.println(" to initialize and sort data");
        long tot = 0;
        for (int i = 0; i < arr.size(); i++) {
            tot += calculateNameScore(arr.get(i), i + 1);
        }
        System.out.println(tot);
        Timer(time);
        System.out.println(" to calcualte name scores.");
    }

    public static int calculateNameScore(String name, int index) {
        int score = 0;
        char[] let = name.toCharArray();
        for (int i = 0; i < let.length; i++) {
            score += (int) (let[i] - 64);
        }
        return score * index;
    }
}
