package com.bytedance.java.java_base_study.day15.exercise3;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 0:15
 * @Description 定义一个Circle类，声明redius属性，提供getter和setter方法
 */
public class Circle {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
