package com.bytedance.java.study.day05;

/**
 * @author yuhang.sun
 * @date 2020/12/21 - 23:00
 */

/*
嵌套循环的应用1：

九九乘法表:
1 * 1 = 1
2 * 1 = 2 2 * 2 = 4
...
 */

public class NineNineTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }

            System.out.println();
        }
    }
}