package day16_Wrapper.Arrays_05;

import java.util.Arrays;
import java.util.List;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class arrays02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 234,123};

        int index = Arrays.binarySearch(arr, 234);
        System.out.println(index);

//        copyOf() 数组元素的复制
//        1,从arr 数组中， 拷贝arr.length 个元素到 newArr 数组中
//        2,如果可拷贝的长度大于arr,length 就在新数组的后面 增加null
//        3,如果拷贝的长度小于0  久抛出异常  negativeArraySizeException
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr));

//        fill() 数组填充
        Integer[] num = new Integer[]{9,3,2};
//        替换所有元素
        Arrays.fill(num,99);

        /*
        * equals 比较两个数组元素内容是否完全一致
        * 1, 一样为true
        * 2, 如果不是完全一样 就返回false
        * */
        Integer[] arr2 = {1,2,3,4,5};
        boolean equals = Arrays.equals(arr, arr2);

        /*
        * asList 将一组数据转成List
        * 1，asList 会将数据传为list集合 然后返回
        * 2，返回的asList 编译类型 List(接口)
        * 3，asList 运行类型 java.util.Arrays 是Arrays 类的静态内部类 ArraysList
        * */
        List asList = Arrays.asList(2,3,4,1,23,4);
        System.out.println("asList"+asList);

    }
}
