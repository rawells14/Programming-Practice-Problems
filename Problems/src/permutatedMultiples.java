public class permutatedMultiples {

    public static void main(String[] args) {

        for (int i = 1; i < 10000000; i++) {
            boolean has6 = true;
            int amt = 1;
            while (has6) {
                if (amt == 6) {
                    System.out.println("solution found: " + i);
                   
                }
                if (!(containsSameDigs(i, i * amt))) {
                    has6 = false;
                } else {
                    amt++;
                }
            }
        }
    }

    public static boolean containsSameDigs(int n, int s) {
        String a = Integer.toString(n);
        String b = Integer.toString(s);

        for (int i = 0; i < a.length(); i++) {
            if (b.contains(a.substring(i, i + 1))) {
                b = b.replaceFirst(a.substring(i, i + 1), "");
            } else {
                return false;
            }
        }
        return b.equals("");
    }

}
