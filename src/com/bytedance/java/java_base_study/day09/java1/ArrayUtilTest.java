package com.bytedance.java.java_base_study.day09.java1;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 20:12
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{22, 34, 65, 12, 34, 56, 87, 2, 4, 900};

        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        util.sort(arr);
        util.print(arr);

        System.out.println("查找");
        int index = util.getIndex(arr, 22);
        if (index >= 0) {
            System.out.println("找到了，索引地址为：" + index);
        } else {
            System.out.println("没找到");
        }
    }
}
