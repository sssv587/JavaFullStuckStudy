package com.bytedance.java.study.day12.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:49
 * @Description
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.1);
        cy.setLength(3.4);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为:" + volume);

        double area = cy.findArea();
        System.out.println("底面圆的面积为:" + area);
    }
}
