package com.bytedance.java.java_base_study.day13.exercise3;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 17:05
 * @Description
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricObject that = (GeometricObject) o;
        return Double.compare(that.weight, weight) == 0 &&
                color.equals(that.color);
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
