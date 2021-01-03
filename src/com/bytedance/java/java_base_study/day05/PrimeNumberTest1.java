package com.bytedance.java.java_base_study.day05;

/**
 * @author yuhang.sun
 * @date 2020/12/21 - 23:28
 */

/*
100以内的所有质数的输出。
质数：素数，只能被1和它本身整除的自然数。  --> 从2开始，到这个数-1结束为止，都不能被这个数本身整除

最小的质数是：2
对PrimeNumberTest中的优化
*/

public class PrimeNumberTest1 {
    public static void main(String[] args) {
        //标识i是否被j除尽，一旦除尽，修改其值
        boolean isFlag;
        //记录质数的个数
        int count = 0;

        //获取当前时间举例1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();

        //遍历100以内的自然数
        for (int i = 2; i <= 100000; i++) {
            isFlag = true;
            //j：被i去除
            //优化二：对本身是质数的自然数是有效的。
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    //优化一：只对本身非质数的自然数是有效的。
                    break;
                }
            }
            //
            if (isFlag) {
                count++;
            }
            //重置isFlag
            //isFlag = true;
        }

        //获取当前时间举例1970-01-01 00:00:00的毫秒数
        long end = System.currentTimeMillis();

        //不优化:11974
        //优化一:break-1117
        //优化二:Math.sqrt(i) 62
        System.out.println("质数的个数为:" + count);
        System.out.println("所花费时间为: " + (end - start));
    }
}
