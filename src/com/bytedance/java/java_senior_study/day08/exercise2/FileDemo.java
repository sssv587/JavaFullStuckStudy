package com.bytedance.java.java_senior_study.day08.exercise2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/24 - 0:20
 * @Description
 */
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file = new File("src/com/bytedance/java/java_senior_study/day08/doc/hello.txt");
        //创建一个与file同目录下的另外一个文件，文件名为：haha.txt
        File destFile = new File(file.getParent(), "haha.txt");
        boolean newFile = destFile.createNewFile();
        if(newFile){
            System.out.println("创建成功!");
        }

        //要想删除成功，java文件目录下不能有子目录或文件
        File file3 = new File("d:\\java");
        System.out.println(file3.delete());
    }
}
