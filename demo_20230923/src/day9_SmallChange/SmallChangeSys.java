package day9_SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
//        通知
        String details = "------------零钱通明细------------";

//        钱  日期
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm"); // 日期格式化
//        消费
        String note = "";
        do {
            System.out.println("=====钱包=====");
            System.out.println("1.明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.println("=============");
            System.out.println("\"请选择1-4\"");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
//                    校验
                    balance += money;
//                    拼接收益信息
                    date = new Date();
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    money = scanner.nextDouble();
//                    校验
                    System.out.print("消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String exit = "";
                    while (true) {
                        System.out.println("你确定退出？ y/n");
                        exit = scanner.next();
                        if("y".equals(exit) || "n".equals(exit)) {
                            break;
                        }
                    }
                    if(exit.equals("y")) {
                        System.out.println("拜拜");
                        loop = false;
                    } else {
                         break;
                    }
                    break;
                default:
                    System.out.println("值有误");
            }

        } while (loop);
        System.out.println("推出了系统");
    }
}
