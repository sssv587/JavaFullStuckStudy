package com.bytedance.java.mytest;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/17 - 1:52
 * @Description
 */
public class StringTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(i);
        }
        System.out.println(stringBuffer);
    }

    public str getInstance(str s) {
      return s;
    }
}


abstract class str {
    int age;
}