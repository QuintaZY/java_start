package day16_Wrapper.Date_06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class Date03 {
    public static void main(String[] args) {
        /*
         * Date类是 Calendar 类之后启用了
         *  Calendar 存在的问题是1，可变性， 偏移性， 格式化， 不是线程安全， 不能处理闰秒*/

        /*
         * LocalDate 日期   LocalTime 时间 LocalDateTime 日期时间*/
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
//        ldt.getYear();
//        ldt.getMonthValue();
//        ldt.getMonth();
//        ldt.getDayOfMonth();
//        ldt.getHour();
//        ldt.getMinute();
//        ldt.getSecond();

//        Date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss");
        String format = dtf.format(ldt);
        System.out.println(format);

    }
}
