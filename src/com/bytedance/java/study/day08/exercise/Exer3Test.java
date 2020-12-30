package com.bytedance.java.study.day08.exercise;

import java.lang.reflect.Method;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 1:21
 * <p>
 * 3.1 编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形， 在main方法中调用该方法。
 * 3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再计算该矩形的面积，
 * 并将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 * 3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的*型矩形，
 * 并计算该矩形的面积， 将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
 */
public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();

        //3.1 测试
        //test.method();

        //3.2 测试
        //方式一：
        //int area = test.method();
        //System.out.println("面z积为:" + area);

        //方式二：
        //System.out.println(test.method());

        //3.3 测试
        System.out.println(test.method(5,5));
    }

    //3.1
    //public void method() {
    //    for (int i = 0; i < 10; i++) {
    //        for (int j = 0; j < 8; j++) {
    //            System.out.print("* ");
    //        }
    //        System.out.println();
    //    }
    //}

    //3.2
    //public int method() {
    //    for (int i = 0; i < 10; i++) {
    //        for (int j = 0; j < 8; j++) {
    //            System.out.print("* ");
    //        }
    //        System.out.println();
    //    }
    //    return 10 * 8;
    //}

    //3.3
    public int method(int m,int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
