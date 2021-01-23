package com.bytedance.java.java_senior_study.day07.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/23 - 2:44
 * @Description
 */
public class PropertiesTest {
    //Properties类是Hashtable的子类，该对象用于处理属性文件。key和value都是String类型
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();
            fis = new FileInputStream("C:\\Users\\10926\\IdeaProjects\\JavaFullStuckStudy\\src\\com\\bytedance\\java\\java_senior_study\\day07\\jdbc.properties");
            //加载流对应的文件
            pros.load(fis);

            String user = pros.getProperty("user");
            String password = pros.getProperty("password");

            System.out.println("user=" + user + "， password=" + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
