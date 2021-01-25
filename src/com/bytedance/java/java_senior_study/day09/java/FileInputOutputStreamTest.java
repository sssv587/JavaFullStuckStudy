package com.bytedance.java.java_senior_study.day09.java;

import org.junit.Test;

import javax.annotation.PostConstruct;
import java.io.*;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/24 - 20:25
 * @Description 测试FileInputStream和FileOutputStream的使用
 * <p>
 * 结论：
 * 1.对于文本文件(.txt,.java,.c,.cpp)，使用字符流来处理
 * 2.对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt...)，使用字节流处理
 */
public class FileInputOutputStreamTest {
    //使用字节流FileInputStream可能出现乱码
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1.造文件
            File file = new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\hello.txt");

            //2.造流
            fis = new FileInputStream(file);

            //3.读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节个数
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    实现对图片的复制操作
     */
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\05.JPG");
            File destFile = new File("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\051.JPG");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
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

    //制定路径下文件的复制
    public void copyFile(String scrPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File(scrPath);
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
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

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\hello.txt";
        String destPath = "C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day09\\doc\\hello3.txt";
        copyFile(srcPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为:" + (start - end));
    }
}
