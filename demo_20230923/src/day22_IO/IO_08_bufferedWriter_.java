package day22_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_08_bufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String file = "d:\\a.java";
        //
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("你好");

        // 关闭外层流
        bufferedWriter.close();
    }
}
