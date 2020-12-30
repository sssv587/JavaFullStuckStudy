package com.bytedance.java.study.day07.java;

import java.util.Arrays;

/**
 * @author yuhang.sun
 * @date 2020/12/25 - 23:43
 * <p>
 * 快速排序实现
 * <p>
 * 一趟快速排序的算法是：
 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 * 2）以第一个数组元素作为基准点。
 * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于A[i](此时基准点)的值A[j]，将值与A[j]交换；
 * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于A[j]（此时基准点）的A[i]，将A[j]与A[i]交换；
 * 5）重复第3步
 * 6）重复第3、4、5步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[j]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束），到此找到基准点的下标，作为分治下标。
 * 7）重复1-6步骤递归排序前半部分
 * 8）重复1-6步骤递归排序后半部分
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int getMiddle(int[] sortArray, int low, int high) {
        int key = sortArray[low];
        //控制的是次数
        while (low < high) {
            while (low < high && sortArray[high] >= key) {
                high--;
            }
            sortArray[low] = sortArray[high];
            while (low < high && sortArray[low] <= key) {
                low++;
            }
            sortArray[high] = sortArray[low];
        }
        sortArray[low] = key;
        return low;
    }

    public static void quickSort(int[] sortArray, int low, int high) {
        if (low < high) {
            //思路是先确定第一个基数的位置，基数位置一旦确定，直接最终该数位置角标左右两边的数组
            int middle = getMiddle(sortArray, low, high);
            quickSort(sortArray, low, middle - 1);
            quickSort(sortArray, middle + 1, high);
        }
    }
}

