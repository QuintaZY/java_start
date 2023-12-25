package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 * FileInputStream
 */
public class IO_02_fileinputstream {
    public static void main(String[] args) {
    }

    @Test
    public void readFile() {
        String filepath = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\news1.txt";
        int readdata = 0;
        FileInputStream fileInputStreams = null;
        try {
            fileInputStreams = new FileInputStream(filepath);
            // 返回-1 表示读取完毕
            while ((readdata = fileInputStreams.read()) != -1) {
                System.out.print((char) readdata); // 转成char
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStreams.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Test
    public void readFile2() {
        String filepath = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\news1.txt";
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStreams = null;
        try {
            fileInputStreams = new FileInputStream(filepath);
            while ((readLen = fileInputStreams.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStreams.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
