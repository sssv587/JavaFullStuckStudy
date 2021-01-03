package com.bytedance.java.java_base_study.day13.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 13:44
 * @Description
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public GeometricObject() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
