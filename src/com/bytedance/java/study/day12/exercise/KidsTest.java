package com.bytedance.java.study.day12.exercise;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:30
 * @Description
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setYearsOld(10);
        someKid.setSex(1);
        someKid.setSalary(1000);
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
