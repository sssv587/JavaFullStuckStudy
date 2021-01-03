package com.bytedance.java.java_base_study.day13.exercise3;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 17:12
 * @Description 写一个测试类，创建两个Circle对象，判断其颜色是否相等；利用equals方法判断其半径是否相等；利用
 * toString()方法输出其半径。
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle("white", 2.0, 2.3);

        System.out.println("颜色是否相等:" + circle1.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等:" + circle1.equals(circle2));
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
