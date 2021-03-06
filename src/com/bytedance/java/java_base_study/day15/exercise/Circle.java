package com.bytedance.java.java_base_study.day15.exercise;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 13:47
 * @Description
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
