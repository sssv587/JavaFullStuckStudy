package com.bytedance.java.java_senior_study.day09.exercise;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/24 - 21:51
 * @Description
 */
public class PicTest {
    //图片的加密
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\01.jpg"));
            fos = new FileOutputStream(new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\011.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                //字节数据进行修改
                //错误的
                //            for (byte b :
                //                    buffer) {
                //                b = (byte) (b ^ 5);
                //            }

                //正确的
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    //图片的解密
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\011.jpg"));
            fos = new FileOutputStream(new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\012.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                //字节数据进行修改
                //错误的
                //            for (byte b :
                //                    buffer) {
                //                b = (byte) (b ^ 5);
                //            }

                //正确的
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
