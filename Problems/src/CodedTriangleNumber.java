import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CodedTriangleNumber {

    static ArrayList<Integer> TriangularNumbers = new ArrayList();
    static ArrayList<Integer> PentagonalNumbers = new ArrayList();
    static ArrayList<Integer> HexagonalNumbers = new ArrayList();

    public static void main(String[] args) throws FileNotFoundException {
        double time1 = System.currentTimeMillis();
        addNums();
        System.out.println(System.currentTimeMillis() - time1 + " seconds to add nums");
        for (int i = 0; i < TriangularNumbers.size(); i++) {
            if (!(PentagonalNumbers.contains(TriangularNumbers.get(i)))) {
                TriangularNumbers.remove(i);
            }

        }
        for (int i = 0; i < TriangularNumbers.size();; i++) {
            if (!(HexagonalNumbers.contains(TriangularNumbers.get(i)))) {
                TriangularNumbers.remove(i);
            }
        }

        System.out.println(TriangularNumbers);

    }

    public static void addNums() {
        for (int i = 0; i < 10000; i++) {
            TriangularNumbers.add((int) ((.5) * (i) * (i + 1)));
        }
        for (int i = 0; i < 10000; i++) {
            PentagonalNumbers.add((int) ((3 * i - 1) * i) / 2);
        }
        for (int i = 0; i < 10000; i++) {
            HexagonalNumbers.add((int) (i * (2 * i - 1)));
        }
    }

}
