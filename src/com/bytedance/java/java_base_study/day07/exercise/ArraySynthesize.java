package com.bytedance.java.java_base_study.day07.exercise;

import java.util.Arrays;

/**
 * @author yuhang.sun
 * @date 2020/12/26 - 15:59
 * 数组练习综合
 * <p>
 * int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
 * 1.使用快速排序，实现如下的数组从小到大排序
 * 2.如何反转上面的数组，请用代码实现
 * 3.复制上述数组，得到一个新的数组
 * 4.使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
 * 5.数组中常见的异常有哪些？请举例说明
 */
public class ArraySynthesize {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 5, 22, -98, 6, -76, 0, -3};

        // 1.使用快速排序，实现如下的数组从小到大排序
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        // 2.如何反转上面的数组，请用代码实现
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        // 3.复制上述数组，得到一个新的数组
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));


        // 4.使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
        int index = binarySearch(arr, 22, 0, arr.length - 1);
        System.out.println(index);
    }

    public static int getMiddle(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= key) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        return high;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {
        int index = -1;
        while (low < high) {
            int middle = (low + high) / 2;
            if (arr[middle] == key) {
                index = middle;
                break;
            } else if (arr[middle] > key) {
                high = middle - 1;
            } else if (arr[middle] < key) {
                low = middle + 1;
            }
        }
        return index;
    }
}
