package com.bytedance.java.java_base_study.day05;

import java.util.Scanner;

/**
 * @author yuhang.sun
 * @date 2020/12/21 - 0:10
 */

/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1.不在循环条件部分限制次数的结构：for(;;) 或 while(true)
2.结束循环有几种方式？
    方式一：循环条件部分返回false
    方式二：在循环体中，执行break
 */


public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //记录正数个数
        int positiveNumber = 0;
        //记录负数个数
        int negativeNumber = 0;

        for (; ; ) {//while (true){
            System.out.println("请输入一个整数:");
            int number = scan.nextInt();
            //判断number正负情况
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                break;
            }
        }
        System.out.println("输入正数的个数是:" + positiveNumber);
        System.out.println("输入负数的个数是:" + negativeNumber);
    }
}