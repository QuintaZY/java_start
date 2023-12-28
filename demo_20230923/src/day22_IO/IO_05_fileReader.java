package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_05_fileReader {
    public static void main(String[] args) {
        // 1 new FileReader()
        // read 每次读取单个字符，返回该字符， 如果到末尾返回-1


    }

    @Test
    public void reader1() {
        String fReader = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\fileReader.txt";
        // 创建对象
        FileReader fileReader = null;
        int datas = ' ';
        try {
            fileReader = new FileReader(fReader);
            //1 循环读取   单个字符读取。  速度慢
            while ((datas = fileReader.read()) != -1) {
                System.out.print((char) datas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void reader2() {
        String fReader = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\fileReader.txt";
        // 创建对象
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(fReader);
            //2 循环读取   使用read(buf) 返回实际读取到的字符数
            while ((readLen = fileReader.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
