package day16_Wrapper.Date_06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class date01 {
    public static void main(String[] args) throws ParseException {
        /*
         * Date类  实在java.util 包
         * 默认输出的日期格式是国外的方式， 因此通常需要对格式进行转换
         * */
        Date d1 = new Date(); // 获取当前的系统时间
        System.out.println("当前日期=" + d1);

        /*
         * 创建 SimpleDateFormat 对象，  可以指定任意格式
         * */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期=" + format);

        /*
        * 可以把一个格式化的字符串转成对应的 Date
        * */
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
    }
}
