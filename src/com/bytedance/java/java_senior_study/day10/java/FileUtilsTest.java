package com.bytedance.java.java_senior_study.day10.java;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/26 - 1:26
 * @Description
 */
public class FileUtilsTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("s.txt");
        File destFile = new File("s1.txt");
        FileUtils.copyFile(srcFile,destFile);
    }
}
