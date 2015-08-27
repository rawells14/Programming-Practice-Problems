/*
 This problem is simply for a challege/fun.
 */
public class WordSpiral {

    public static void main(String[] args) {
        String word = "ryan";
        int counter = 1;
        for (int i = 0; i < word.length() * 2 - 1; i++) {
            System.out.print(word.charAt(0));
        }
        System.out.println("");
        for (int i = 0; i < word.length() * 2 - 1; i++) {
            String temp = word.substring(0, counter);
            for (int j = 0; j < word.length() - counter; j++) {
                temp += temp.substring(counter - 1, counter);
            }
            temp += flip(temp);
            System.out.println(temp);

            counter += 1;
        }

        for (int i = 0; i < word.length() * 2 - 1; i++) {
            System.out.print(word.charAt(0));
        }
    }

    public static String flip(String s) {
        StringBuilder f = new StringBuilder(s);
        f.reverse();
        return f.toString();
    }

}
