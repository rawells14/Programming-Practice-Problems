import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixSumming {

    public static void main(String[] args) {
        Scanner asdf = new Scanner(System.in);
        int[][] data = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};
        int amt = asdf.nextInt();

        for (int i = 0; i < amt; i++) {
            int coords = asdf.nextInt();
            System.out.println(Arrays.toString(getAdjacent(data, coords)));
        }
    }

    public static int[] getAdjacent(int matrix[][], int coords) {
        ArrayList<Integer> f = new ArrayList();
        
        return matrix[1];
    }

}
