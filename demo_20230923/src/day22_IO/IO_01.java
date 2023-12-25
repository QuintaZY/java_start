package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 * 创建文件
 */
public class IO_01 {
    public static void main(String[] args) {
        File file = new File("/");
    }
    @Test
    public void created1() {
        String filePath = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void created2() {
        File file = new File("d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io");
        String filename = "news2.txt";
        File file1 = new File(file,filename);
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    * getName 获取文件名
    * getAbsolutePath 绝对路径
    * getParent 父目录
    * length  大小  字节
    * exists 是否存在
    * isFile 是不是文件
    * isDirectory 是不是文件夹
    * */

    /*
    * 目录操作和文件删除
    * mkdir 创建一级目录
    * mkdirs 创建多级目录
    * delete 删除空目录或文件
    * */
}
