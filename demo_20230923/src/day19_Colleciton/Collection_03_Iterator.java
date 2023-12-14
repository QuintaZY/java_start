package day19_Colleciton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Collection_03_Iterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("sanmu", "张", 10.0));
        col.add(new Book("sasdagfu", "张1", 12.0));
        col.add(new Book("yi111", "shaizsng", 19.0));

        System.out.println("col=" + col);

        /*
        * 遍历 col 集合
        * 1, 先得到col对应的 迭代器
        * 2，循环
        * 3，循环完成后迭代器指向最后一个元素
        * 4，
        * */
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
