package com.bytedance.java.java_base_study.day10.exercise1;

/**
 * @author yuhang.sun
 * @date 2020/12/29 - 22:51
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        t1.setBase(2.0);
        t1.setHeight(2.0);
        //t1.base = 2.5;
        //t1.height = 2.5;
        System.out.println("base:" + t1.getBase() + ",height:" + t1.getHeight());

        TriAngle t2 = new TriAngle(5.1,5.6);
        System.out.println("base:" + t2.getBase() + ",height:" + t2.getHeight());
    }
}
