import java.util.ArrayList;

public class distinctPowers {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if (!(data.contains(Double.toString(Math.pow(i, j))))) {
                    data.add(Double.toString(Math.pow(i, j)));
                }

            }
        }
        System.out.println(data.size());
    }

}
