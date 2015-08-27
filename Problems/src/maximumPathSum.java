
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class maximumpathsum {

    public static int size = 15;
    public static int[][] triangle;
    public static int highestSum = 0;
    public static ArrayList<Integer> sums = new ArrayList();

    public static void main(String args[]) throws FileNotFoundException {
        Scanner scn = new Scanner(new File("in.txt"));

        triangle = new int[size][size];
        init();
        int col = 1;
        label1:
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > i) {
                    break;
                }
                triangle[i][j] = scn.nextInt();
            }
        }
        compute(0, 0, 0);
        System.out.println(highestSum);
        System.out.println(sums);
    }

    public static void compute(int currentSum, int x, int y) {
        if (!isValid(x, y)) {
            return;
        }
        if (triangle[x][y] == -1) {
            return;
        }

        currentSum += triangle[x][y];
        if (currentSum > highestSum) {
            highestSum = currentSum;
            sums.add(currentSum);
        }
        compute(currentSum, x + 1, y);
        compute(currentSum, x + 1, y + 1);





    }

    public static boolean isValid(int x, int y) {
        return (x < size && x >= 0) && (y < size && y >= 0);
    }

    public static void printArray() {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
    }

    public static void init() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                triangle[i][j] = -1;
            }
        }
    }
}
