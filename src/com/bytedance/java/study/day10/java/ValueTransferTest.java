package com.bytedance.java.study.day10.java;

/**
 * @author yuhang.sun
 * @date 2020/12/28 - 23:04
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        String s1 = "hello";
        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);
        System.out.println(s1);
    }

    public void change(String s){
        s = "hi~~~";
    }
}
