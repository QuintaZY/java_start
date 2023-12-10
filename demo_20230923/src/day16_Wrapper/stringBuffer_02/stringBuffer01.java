package day16_Wrapper.stringBuffer_02;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class stringBuffer01 {
    public static void main(String[] args) {
//         1, string 直接父类是 AbstractStringBuilder
//         2，实现了 Serializable  string buffer 的对象可以串行化
//         3，在父类中， AbstractStringBuilder 有属性 char[] value, 不是final
//         该value数组存放字符串内容， 引出存放在堆中的
//         string buffer 是一个final类， 不能被继承
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);


    }
}
