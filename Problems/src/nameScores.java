
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class nameScores {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner asdf = new Scanner(new File("names.txt"));
        String data[] = asdf.nextLine().replaceAll("\"", "").split(",");
        long tot = 0;
        for (int i = 0; i < data.length; i++) {
            tot+= calculateNameScore(data[i],i+1);
        }
        System.out.println(tot);

        
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
