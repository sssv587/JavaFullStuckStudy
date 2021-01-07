package com.bytedance.java.mytest;

/**
 * @author yuhang.sun
 * @date 2020/12/20 - 21:20
 */
//https://blog.csdn.net/billion_Fu/article/details/77671555?utm_source=blogxgwz5

public class AddTest {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 5; j++) {
            // i = i++; ----> i = i;i++;
            // ----> int temp = i, i = i + 1; i = temp;
            // i = ++i; ----> i = i + 1; i = i;
            // ----> i = i + 1, int temp = i; i = temp;
            i = i++;
            System.out.println("i =" + i);
        }
    }
}


//abstract class Person{
//    public static void eat();
//}