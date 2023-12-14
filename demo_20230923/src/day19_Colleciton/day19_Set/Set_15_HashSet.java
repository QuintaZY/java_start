package day19_Colleciton.day19_Set;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Set_15_HashSet {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet set = new HashSet();
        // add方法之后返回一个布尔值    成功时true 失败是false
        System.out.println(set.add("join"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("kkl"));
        System.out.println(set.add("lucy"));
        set.remove("join");

    }
}
