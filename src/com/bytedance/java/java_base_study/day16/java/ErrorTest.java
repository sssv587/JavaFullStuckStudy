package com.bytedance.java.java_base_study.day16.java;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 18:28
 * @Description Java虚拟机无法解决的严重问题。如：JVM系统内部错误、资源耗尽等严重情况。比如：StackOverflowError和OOM。
 * 一般不编写针对性的代码进行处理。
 *
 */
public class ErrorTest {
    public static void main(String[] args) {
        //1.栈溢出 java.lang.StackOverflowError
        //main(args);

        //2.堆溢出 java.lang.OutOfMemoryError
        //Integer[] arr = new Integer[1024 * 1024 * 1024 ];


    }
}
