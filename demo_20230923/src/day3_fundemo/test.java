package day3_fundemo;

public class test {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};


        printArr(arr);
    }

    // 遍历数组
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]  + ",");
            }
            System.out.print(arr[i] + "，");
        }
    }

    int[] arr = {1,2,3,4,5,6,7,8,9};
    public static int[] copyOfRange(int[] arr, int from, int to) {
        //
        int[] newArr = new int[to -from];

        int index = 0;
        for (int i = from; i < to; i++) {
           newArr[index]  = arr[i];
           index++;
        }

        return newArr;
    }


    
}
