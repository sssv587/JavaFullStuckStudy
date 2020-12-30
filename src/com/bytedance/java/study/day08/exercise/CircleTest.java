package com.bytedance.java.study.day08.exercise;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 1:08
 * <p>
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 8.8;

        //方式一：
        //double area = c1.findArea();
        //System.out.println(area);

        //方式二：
        c1.findArea();
    }
}


//圆
class Circle {
    //属性
    double radius;

    //求圆的面积
    //方式一：
    //public double findArea() {
    //    return Math.PI * radius * radius;
    //}
    //方式二：
    public void findArea() {
        System.out.println("圆的面积为:" + (Math.PI * radius * radius));
    }
}