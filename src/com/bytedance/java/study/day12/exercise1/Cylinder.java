package com.bytedance.java.study.day12.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:46
 * @Description
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public Cylinder(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume() {
        //return Math.PI * getLength() * getRadius() * getRadius();
        return super.findArea() * length;
    }

    //返回圆柱的表面积
    @Override
    public double findArea() {
        return super.findArea() + Math.PI * 2 * getRadius() * getLength();
    }
}
