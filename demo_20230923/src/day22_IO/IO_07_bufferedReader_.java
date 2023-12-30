package day22_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_07_bufferedReader_ {
    public static void main(String[] args) throws IOException {
        String file = "d:\\a.java";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String name;

        // 按行读取文件
        // 当返回null时，表示文件读取完毕
        while ((name = bufferedReader.readLine()) != null) {
            System.out.print(name);
        }

        // 关闭流
        bufferedReader.close();
    }
}
