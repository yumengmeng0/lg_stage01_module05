package p02;

import java.io.*;

/**
 * @author: ymm
 * @date: 2022/5/9
 * @version: 1.0.0
 * @description:
 */
public class InputStreamTest {
    public static void main(String[] args) {

        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("e://test//a.txt");
            outputStream = new FileOutputStream("e://test//b.txt");

            // 实现文件的复制，底层是read/write方法的调用
            inputStream.transferTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {

                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {

                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
