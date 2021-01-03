package com.bytedance.java.java_base_study.day09.java2;

/**
 * @author yuhang.sun
 * @date 2020/12/28 - 21:55
 * <p>
 * 递归方法的调用(了解)
 * 1.递归方法：一个方法体内调用它自身。
 * 2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 3.递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

        //例1：计算1-100之间所有自然数的和
        //方式一：
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        //方式二：
        System.out.println(test.getSum(100));

        //例2
        System.out.println(test.getSum1(100));

        //例3
        System.out.println(test.f(10));

        //例4
        System.out.println(test.f1(10));

        //例5
        System.out.println(test.fibonacci(5));
    }

    //计算1-100之间所有自然数的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }

    //例2：计算1-100之间所有自然数的乘积:n!
    public int getSum1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getSum(n - 1);
    }

    //例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        }
        return 2 * f(n - 1) + f(n - 2);
    }

    //例4：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),其中n是大于0的整数，求f(10)的值。
    public int f1(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        }
        return f1(n + 2) - 2 * f1(n + 1);
    }

    //例5:输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
    //1 1 2 3 5 8 13 21 34 55
    //规律：一个数等于前两个数之和
    //要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    //例5：汉诺塔问题

    //例6：快速排序
}
