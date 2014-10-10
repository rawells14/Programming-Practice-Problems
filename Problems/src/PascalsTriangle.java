
public class PascalsTriangle {

    public static void main(String[] args) {
        long num[][] = new long[42][42];
        num[0][0] = 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i >= 1 && j >= 1) {
                    num[i][j] = num[i - 1][j] + num[i - 1][j - 1];
                }
            }
        }
        printArray(num);
        System.out.println(num[41][21]);
    }

    public static void printArray(long num[][]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
