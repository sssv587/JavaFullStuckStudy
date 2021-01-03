package com.bytedance.java.java_base_study.day12.exercise;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 0:29
 * @Description 定义类Kids继承ManKind，并包括
 * 成员变量int yearsOld；
 * 方法printAge()打印yearsOld的值。
 */
public class Kids extends ManKind {
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        super(sex, salary);
        this.yearsOld = yearsOld;
    }

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    @Override
    public void employeed() {
        System.out.println("Kids should study and no job");
    }
}
