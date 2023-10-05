package day4_funpractice;

import com.sun.tools.javac.Main;

public class pracitce4 {
    public static void main(String[] args) {
        // 1，定义一个老数组存储一些元素
        int[] arr = {1,2,3,4,5};
        // 2，定义一个新数组的长度和老数组一致
        int[] newArr = new int[arr.length];
        // 3，遍历老数组，得到老数组的每一个元素，存入新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

    }
}
