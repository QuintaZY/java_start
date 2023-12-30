package day22_IO;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @version 1.0
 * @auther zhangyx
 */
public class IO_05_fileWriter {
    public static void main(String[] args) {

    }
    @Test
    public void writer() {
        String fReader = "d:\\code\\IdeaProject\\java_start\\demo_20230923\\src\\z_io\\fileReader.txt";
        // chuangjian FileWriter duixiang
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fReader);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
