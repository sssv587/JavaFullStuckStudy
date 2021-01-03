package com.bytedance.java.java_base_study.day13.exercise3;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 17:06
 * @Description
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        radius = 1.0;
//        color = "white";
//        weight = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

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

    //求圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
