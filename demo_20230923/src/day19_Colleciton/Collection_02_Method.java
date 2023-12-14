package day19_Colleciton;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Collection_02_Method {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list" + list);
        list.remove(0);
        System.out.println("list" + list);

    }
}
