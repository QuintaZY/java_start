package day4_funpractice;

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        // 打分，最低最高， 求平均
//      1,定义一个数组,存储评委的打分
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
//      2,数组中的最大值
        int max = getMax(scoreArr);
//      3,数组中的最小值
        int min = getMin(scoreArr);
//      4,数组中6个分数的总和
        int sum = getSum(scoreArr);
//      5,平均分
        int avg = (sum - max - min) / (scoreArr.length - 2);

        System.out.println("选手的最终成绩是" + avg);
    }

    // 求最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            }
        }
        return scores;
    }
}
