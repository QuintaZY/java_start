package day4_funpractice;

import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]);
        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }
        int number = r.nextInt(10);
        result = result + number;

        System.out.println(result);
    }
}
