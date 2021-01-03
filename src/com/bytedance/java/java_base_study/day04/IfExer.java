package com.bytedance.java.java_base_study.day04;

/**
 * @author yuhang.sun
 * @date 2020/12/20 - 17:18
 */


public class IfExer {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2) {
            //就近原则
            if (y > 2) {
                System.out.println(x + y);
            }
            System.out.println("atguigu");
        } else {
            System.out.println("x is " + x);
        }

        boolean b = true;
        //如果写成if(b=false)能编译通过吗？如果能，结果是？
        if (b = false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }

        //课后练习3：测算狗的年龄
        int dogAge = 5;
        if (dogAge >= 0 && dogAge <= 2) {
            System.out.println("相当于人的年龄：" + dogAge * 10.5);
        } else if (dogAge > 2) {
            System.out.println("相当于人的年龄：" + (2 * 10.5 + (dogAge - 2) * 4));
        } else {
            System.out.println("狗狗还没出生呢!");
        }

        //课后练习4：如何获取一个随机数：10-99
        //[0.0,1.0) ---> [10,99]
        double value = (int) (Math.random() * 90 + 10);
        System.out.println(value);

        //公式：[a,b]:(int)(Math.random()*(b-a+1)+a)
    }
}
