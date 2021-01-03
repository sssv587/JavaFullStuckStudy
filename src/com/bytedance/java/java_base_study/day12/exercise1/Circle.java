package com.bytedance.java.java_base_study.day12.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:45
 * @Description
 */
public class Circle {
    private double radius;//半径

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //返回圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
