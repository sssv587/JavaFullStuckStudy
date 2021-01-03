package com.bytedance.java.java_base_study.day06;

/**
 * @author yuhang.sun
 * @date 2020/12/23 - 21:52
 */

/*
⑤ 数组元素的默认初始化值
        > 数组元素是整型:0
        > 数组元素是浮点型:0.0
        > 数组元素是char型:0或'\u0000',而非'0'
        > 数组元素是boolean型：false
        > 数组元素是引用数据类型时:null

⑥ 数组的内存解析

 */

public class ArrayTest1 {
    public static void main(String[] args) {
        //5.数组元素的默认初始化值
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        char[] arr1 = new char[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("----" + arr1[i] + "****");
        }

        if (arr[1] == 0) {
            System.out.println("你好!");
        }

        boolean[] arr2 = new boolean[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        String[] arr3 = new String[4];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        if(arr3[0] == null){
            System.out.println("今天天气不错!");
        }
    }
}
