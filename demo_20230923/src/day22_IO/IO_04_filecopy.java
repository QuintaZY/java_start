package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_04_filecopy {
    public static void main(String[] args) {
        /*
        * 1. 创建文件的输入流   复制内容
        * 2。创建文件的输出流   写入到文件中
        * 3。
        * */
    }
    @Test
    public void fileCopy () {
        String fp = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\write1.txt";
        String fp2 = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\writeCopy.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(fp);
            fileOutputStream = new FileOutputStream(fp2);
            // 定义一个字节数组
            byte[] buf = new byte[1024];
            int lens = 0;
            while((lens = fileInputStream.read(buf)) != -1) {
                // 读取到最后就写入文件    一边读一边写
                fileOutputStream.write(buf);
            }
            System.out.println("拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileInputStream != null) {
                    fileInputStream.close();
                }
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
