package com.bytedance.java.study.day05;

/**
 * @author yuhang.sun
 * @date 2020/12/21 - 22:34
 */

/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环

2.
外层循环：循环结构B
内层循环：循环结构A

3.说明
①内存循环遍历一遍，只相当于外层循环循环体执行了一次
②假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m*n次

4.技巧：
   外层循环控制行数，内层循环控制列数
 */

public class ForForTest {
    public static void main(String[] args) {
        //******
        // System.out.println("******");

        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.println();
        /*
         ******
         ******
         ******
         ******
         */
        for (int j = 1; j < 4; j++) {
            for (int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println('\n');
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 1; i <= 5; i++) { //控制行数
            for (int j = 1; j <= i; j++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }

        /*       规律：i+j=5 换句话说：j=5-i
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= 5; i++) { //控制行数
            for (int j = 1; j <= 5 - i; j++) {//控制列数
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
