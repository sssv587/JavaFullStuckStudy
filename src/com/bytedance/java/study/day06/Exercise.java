package com.bytedance.java.study.day06;

/**
 * @author yuhang.sun
 * @date 2020/12/22 - 22:32
 */

/*
一个数如果恰好等于它的因子之和，这个数就称为"完数"。找出1000以内的所有完数。
 */

public class Exercise {
    public static void main(String[] args) {
        int factor;
        for (int i = 1; i <= 1000; i++) {
            factor = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    factor += j;
                }
            }
            if (factor == i) {
                System.out.println(i + "是完数");
            }
        }

        /*
         *****
         ****
         ***
         **
         *
         */

        //外层循环控制行数
        for (int i = 0; i < 6; i++) {
            //内层循环控制列数
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
