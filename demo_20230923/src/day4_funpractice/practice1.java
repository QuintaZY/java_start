package day4_funpractice;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("原价");
        int ticket = sc.nextInt();
        System.out.println("月份");
        int mouth = sc.nextInt();
        System.out.println("舱位");
        int seat = sc.nextInt();
        if (mouth >= 5 && mouth <= 10) {
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((mouth >= 1 && mouth <= 4) || (mouth >= 11 && mouth <= 12)) {
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("数据不合法");
        }

        System.out.println(ticket);
    }

    public static int getPrice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
        } else {
            System.out.println("舱位没有");
        }
        return ticket;
    }
}
