package com.bytedance.java.study.day06;

/**
 * @author yuhang.sun
 * @date 2020/12/24 - 0:03
 */

/*
二维数组的使用：
    规定：二维数组分为外层数组的元素，内层数组的元素
    int[][] arr = new int[4][3];
    外层元素：arr[0],arr[1]等
    内层元素：arr[0][0],arr[1][2]等

    ⑤ 数组元素的默认初始化
    针对于初始化方式1：比如：int[][] arr = new int[4][3];
        外层元素的初始化值为：地址值
        内层元素的初始化值为：与一维数组初始化情况相同
    针对于初始化方式2：比如：int[][] arr = new int[4][];
        外层元素的初始化值为：null
        内层元素的初始化值为：不能调用，否则报错

    ⑥ 数组的内存解析
 */

public class ArrayTest3 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//[I@677327b6
        System.out.println(arr[0][0]);//0
        System.out.println(arr);//[[I@14ae5a5

        System.out.println("*****************");

        float[][] arr1 = new float[4][3];
        System.out.println(arr1[0]);//地址值
        System.out.println(arr1[0][0]);//0.0

        String[][] arr2 = new String[4][2];
        System.out.println(arr2[1]);//地址值
        System.out.println(arr2[1][1]);//null

        System.out.println("*****************");
        String[][] arr3 = new String[4][];
        System.out.println(arr3[1]);//null
        System.out.println(arr3[1][0]);//NullPointerException
    }
}
