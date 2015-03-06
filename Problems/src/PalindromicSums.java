public class PalindromicSums {

    public static void main(String[] args) {
        double time1 = System.currentTimeMillis();
        for (int x = 1; x < 10000; x++) {
            for (int y = 1; y < 10000; y++) {
                for (int z = 1; z < 10000; z++) {
                    if (x > y && y > z) {
                        if (isOk(x, y, z)) {
                            System.out.println("Solution Found: " + x + "    " + y + "    " + z);

                        }
                    }
                }
            }
            if (x % 100 == 0) {
                System.out.println(x + "th iteration");
            }
        }
        System.out.println(System.currentTimeMillis() - time1 + " miliseconds");
    }

    public static boolean isOk(int a, int b, int c) {
        if (!(isPerfectSquare(a + b))) {
            return false;
        }
        if (!(isPerfectSquare(a - b))) {
            return false;
        }
        if (!(isPerfectSquare(a + c))) {
            return false;
        }
        if (!(isPerfectSquare(a - c))) {
            return false;
        }
        if (!(isPerfectSquare(b + c))) {
            return false;
        }
        if (!(isPerfectSquare(b - c))) {
            return false;
        }
        return true;
    }

    public static boolean isPerfectSquare(int s) {
        return Math.sqrt(s) % 1 == 0;
    }

}
