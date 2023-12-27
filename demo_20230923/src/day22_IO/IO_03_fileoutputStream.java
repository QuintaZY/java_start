package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_03_fileoutputStream {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        String filePath = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\write1.txt";
        FileOutputStream fileOutputStream = null;
        try {
            /*
            * 1. 这种方式是覆盖写法
            * */
//            fileOutputStream = new FileOutputStream(filePath);

            // 1写入字节

            // 2写入字节数组
            String Word = "helloWorld";  // 将字符串转为字节
            // Word.getBytes()
            // fileOutputStream.write(Word.getBytes());
            // fileOutputStream.write(Word.getBytes(),0, Word.length());  // off是偏移量， length是长度

            /*
            * 2.  这是续写写法
            * */
            fileOutputStream = new FileOutputStream(filePath, true);
            fileOutputStream.write(Word.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
