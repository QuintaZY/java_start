package day19_Colleciton.day19_List;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class List_06_Method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张");
        list.add("丰");
        System.out.println("list=" + list);
        list.add(1, "三");
        System.out.println("list=" + list);

//        indexOf()  返回首次出现的位置
//        lastIndexOf  返回末次出现的位置
//        remove()   索引 删除元素  返回位置
//        set()  设置指定位置的元素为ele , 替换
//        subList  返回从from Index 到 to INdex 位置的子集合

    }
}
