package com.bytedance.java.java_base_study.day07.java;

import java.util.Arrays;

/**
 * @author yuhang.sun
 * @date 2020/12/24 - 23:58
 */

/*
算法的考察：数组的复制、反转、查找(线性查找、二分法查找)
 */

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "GG", "AA"};

        //数组的复制(区别于数组变量的赋值：arr1 = arr)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));

        //数组的反转
        //方式一：
//        for (int i = 0; i < arr.length / 2; i++) {
//            String temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }

        //方式二：
//        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//            String temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        System.out.println(Arrays.toString(arr));

        //查找(或搜索)
        //线性查找:
        String dest = "GG";
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("很遗憾，没有找到哦！");
        }

        //二分法查找：(熟悉)
        //前提：所要查找的数组必须有序。
        int[] arr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int dest1 = 5;
        //初始的首索引
        int head = 0;
        //初始的末索引
        int end = arr2.length - 1;
        boolean isFlag1 = true;

        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest1 == arr2[middle]) {
                System.out.println("找到了指定的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            } else if (arr2[middle] > dest1) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (isFlag1) {
            System.out.println("没有找到该元素!");
        }
    }
}
