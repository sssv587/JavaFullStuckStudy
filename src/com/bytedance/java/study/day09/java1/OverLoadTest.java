package com.bytedance.java.study.day09.java1;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 20:28
 * <p>
 * 方法的重载(overload) loading....
 * <p>
 * 1.定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同
 * "两同一不同"：同一个类、相同方法名
 * 参数列表不同：参数个数不同，参数类型不同
 * <p>
 * 2.举例：Arrays里的sort() / binarySearch()
 * <p>
 * 3.判断是否是重载：
 * 跟方法的权限修饰符、返回值类型、形参变量名、方法体都没有关系！
 *
 * 4.在通过对象调用方法时，如何确定某一个指定的方法：
 *   方法名  ---->  参数列表
 *
 */
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1, 2);
    }

    //如下的4个方法构成了重载
    public void getSum(int i, int j) {
        System.out.println("1");
    }

    public void getSum(double i, double j) {
        System.out.println("2");
    }

    public void getSum(String s, int i) {
        System.out.println("3");
    }

    public void getSum(int i, String s) {
    }

    //不可以，不符合定义。同一个类同一个名，形参列表相同
    //public int getSum(int i, int j) {
    //    return 0;
    //}

    //private void getSum(int i, int j) {
    //}
}
