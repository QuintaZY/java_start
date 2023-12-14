package day19_Colleciton.day19_Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Set_14_method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // set的实现类 HashSet
        // set接口的实现类对象   不能存放重复的元素
        // set接口对象存放数据是无序   (添加和取出的顺序不一致)
        HashSet hashSet = new HashSet();
        hashSet.add("123");
        hashSet.add("18431544");
        hashSet.add("1是的");
        hashSet.add("最先进的发");
        hashSet.add("fsdf");
        hashSet.add(null);



        /*
         * 遍历方式
         */
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        for (Object o : hashSet) {
            System.out.println("0=" + o);
        }
        // set 没有索引
    }
}
