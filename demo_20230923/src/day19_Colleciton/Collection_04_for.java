package day19_Colleciton;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Collection_04_for {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("sanmu", "张", 10.0));
        col.add(new Book("sasdagfu", "张1", 12.0));
        col.add(new Book("yi峰", "shaizsng", 19.0));

        System.out.println("col=" + col);
        // 增强for    底层依旧是迭代器
        for (Object book : col) {
            System.out.println("book=" + book);
        }
        // 也可以直接在数组使用
    }
}
