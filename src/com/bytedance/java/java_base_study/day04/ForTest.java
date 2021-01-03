package com.bytedance.java.java_base_study.day04;

/**
 * @author yuhang.sun
 * @date 2020/12/20 - 20:49
 */

/*
For循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件 ---> 是boolean类型
③ 循环体
④ 迭代条件

二、for循环的结构
for(①;②;④){
    ③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

 */

public class ForTest {
    public static void main(String[] args) {
        //i 1,2,3,4,5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World!");
        }

        //i:只在for循环内有效，出了for循环就失效了。
        //System.out.println(i);

        //练习：
        int num = 1;
        for (System.out.println('a'); num <= 3; System.out.println('c'), num++) {
            System.out.println('b');
        }
        //输出结果：abcbcbc

        //例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        //记录所有偶数的和
        int sum = 0;
        //记录偶数的个数
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count ++;
            }
        }
        System.out.println("总和为:" + sum);
        System.out.println("个和为:" + count);
    }
}
