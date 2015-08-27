
import java.util.Scanner;

public class numbersprialdiagonals {

    public static int[][] initArray() {
        Scanner asdf = new Scanner(System.in);
        System.out.println("Enter the dimensions of the spiral: ");
        int arr[][] = new int[asdf.nextInt()][asdf.nextInt()];
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = initArray();
        int num = 1;
        int widthCounter = arr ;
        int heightCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = widthCounter; j < arr[i].length - widthCounter; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
