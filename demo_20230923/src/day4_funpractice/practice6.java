package day4_funpractice;

public class practice6 {
    public static void main(String[] args) {
//        1983
        int[] arr = {1, 9, 8, 3};
//        加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
//        对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
//        数字反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//        拼接
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
//        System.out.println(number);

//        解密
        int result = decode();
    }

    public static int decode() {
        int number = 8346;
//        定义一个临时变量
        int temp = number;
//        定义一个变量统计数量
        int count = 0;
        while (number != 0) {
            number = number / 10;
//            System.out.println(number);
            count ++;
        }
        int[] arr = new int[count];
//        把数组的每一位添加到数组中
        int index = arr.length - 1;
        while (temp != 0) {
//            tamp中的每一个位数字
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        return number;
    }
}
