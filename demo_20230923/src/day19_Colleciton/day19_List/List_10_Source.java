package day19_Colleciton.day19_List;

import java.util.ArrayList;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class List_10_Source {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

//      使用无参构造器创建ArrayList 对象
//        ArrayList list = new ArrayList();
        ArrayList list = new ArrayList(10);
//      使用for循环 添加1-10 数据
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
//      使用for循环 添加11-15 数据
        for (int i = 0; i <= 15; i++) {
            list.add(i);
        }

        list.add(100);
        list.add(200);
    }
}
