package day4_funpractice;

import java.util.Random;

public class practice7 {
    public static void main(String[] args) {
//        双色球
        int[] arr = new int[7];
//        随机生成号码添加到数组中
//        红  不能重复
//        蓝  可以和红球重复

//        红球添加到数组中
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
//        生成篮球号码
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
