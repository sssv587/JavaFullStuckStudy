package com.bytedance.java.study.day03;

/**
 * @author yuhang.sun
 * @date 2020/12/15 - 22:12
 */

/*
运算符之三：比较运算符
== != > < >= <= instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 == 和 =
 */

public class CompareTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        //false
        System.out.println(i == j);
        //20
        System.out.println(i = j);

        boolean b1 = true;
        boolean b2 = false;
        //false
        System.out.println(b2 == b1);
        //true
        System.out.println(b2 = b1);
    }
}
