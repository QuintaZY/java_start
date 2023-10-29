package day9_SmallChange;

import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("=====钱包=====");
            System.out.println("1.明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");

            System.out.println("\"请选择1-10\"");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println("1 明细");
                    break;
                case "2":
                    System.out.println("2 收益入账");
                    break;
                case "3":
                    System.out.println("3 消费");
                    break;
                case "4":
                    System.out.println("4 退出");
                    loop = false;
                    break;
                default:
                    System.out.println("值有误");
            }

        } while (loop);
        System.out.println("推出了系统");
    }
}
