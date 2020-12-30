package com.bytedance.java.study.day07.java;

import java.util.Arrays;

/**
 * @author yuhang.sun
 * @date 2020/12/25 - 23:28
 * <p>
 * 数组的冒泡排序的实现
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 6, 9, 3, 28, 1, 7, 5, 11, 14};
        int[] arr1 = new int[]{7, 2, 6, -9, 3, 28, 1, 7, 5, 11, 14};

        //冒泡排序
        //外层循环控制循环次数，循环次数为：数组长度-1
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制比较次数，循环次数为：数组长度 - 外层循环次数 - 1 （外层循环为0时）
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 1; i < arr1.length ; i++) {
            for (int j = 0; j < arr1.length - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
