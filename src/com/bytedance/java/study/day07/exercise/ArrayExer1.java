package com.bytedance.java.study.day07.exercise;

/**
 * @author yuhang.sun
 * @date 2020/12/24 - 22:19
 */
public class ArrayExer1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        //记录总和
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("arr的总和是:" + sum);
    }
}