package day16_Wrapper.system_06;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class System_ {
    public static void main(String[] args) {
        /*
        * exit 推出当前程序
        * */
//        System.out.println("ok1");
        // 1, exit(0) 表示程序退出
        // 2, 0 表示一个状态， 正常的状态
//         System.exit(0);
//        System.out.println("ok2");

        /*
        * arraycopy 复制数组元素， 比较适合底层调用
        * 一般使用arrays.copyOf 拷贝
        *
        * */
        int[] src = {1,2,3};
        int[] dest = new int[3]; // dest 当前是{0，0，0}
        //
//        System.arraycopy(src,0,dest,0,3);

        /*
        * currentTimeMillis 返回距离1970-1-1的毫秒数
        * */
        System.out.println(System.currentTimeMillis());
    }
}
