package day19_Colleciton.day19_List;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class List_07_exercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello");
        }
        System.out.println("list=" + list);

        list.add(1, "zhang");
        System.out.println("list=" + list);
        System.out.println("" + list.get(4));
        list.remove(5);
        System.out.println("list=" + list);
        list.set(6,"修改的元素");
        System.out.println("list=" + list);

    }
}
