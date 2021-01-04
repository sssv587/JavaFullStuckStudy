package com.bytedance.java.java_base_study.day14.java1;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 20:06
 * <p>
 * 自定义数组的工具类
 */
public class ArrayUtil {
    //求数组的最大值
    public static int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //求数组的最小值
    public static int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //求数组的总和
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求数组的平均值
    public static int getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    //如下的两个同名方法构成了重载
    //反转数组
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void reverse(String[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //复制数组
    public static int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //int temp = arr[j];
                    //arr[j] = arr[j + 1];
                    //arr[j + 1] = temp;
                    //错误的
                    //swap(arr[j], ar[j + 1]);

                    //正确的
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    //错误的：交换数组中指定的两个位置元素的值
    //public void swap(int i, int j) {
    //    int temp = i;
    //    i = j;
    //    j = temp;
    //}

    //正确的：交换数组中指定的两个位置元素的值
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //遍历数组
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    //查找指定元素
    public static int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
