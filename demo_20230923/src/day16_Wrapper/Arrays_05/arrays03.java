package day16_Wrapper.Arrays_05;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class arrays03 {
    public static void main(String[] args) {
        /*
        * Boos类 包含name 和 price  按price排序
        *
        * */
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("三国演义", 78);
        books[2] = new Book("心心在哪里", 200);
        books[3] = new Book("围城", 10);

        // price 大到小
//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                double priceTo = book2.getPrice() - book1.getPrice();
//                if(priceTo > 0) {
//                    return -1;
//                } else if (priceTo < 0) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        // price 小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceTo = book2.getPrice() - book1.getPrice();
                if(priceTo > 0) {
                    return 1;
                } else if (priceTo < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        // name 从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book2.getName().length() - book1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }

}
class Book {
    private String name;
    private double price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}