package com.bytedance.java.study.day05;

/**
 * @author yuhang.sun
 * @date 2020/12/21 - 23:10
 */

/*
100以内的所有质数的输出。
质数：素数，只能被1和它本身整除的自然数。  --> 从2开始，到这个数-1结束为止，都不能被这个数本身整除

最小的质数是：2
 */

public class PrimeNumberTest {
    public static void main(String[] args) {
        //标识i是否被j除尽，一旦除尽，修改其值
        boolean isFlag;

        //遍历100以内的自然数
        for (int i = 2; i <= 100; i++) {
            isFlag = true;
            //j：被i去除
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            //
            if (isFlag) {
                System.out.println(i);
            }
            //重置isFlag
            //isFlag = true;
        }
    }
}
