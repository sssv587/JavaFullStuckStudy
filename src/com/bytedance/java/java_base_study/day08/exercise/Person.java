package com.bytedance.java.java_base_study.day08.exercise;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 0:52
 */
public class Person {
    String name;
    int age;
    /**
     * sex:1 表明是男性
     * sex:0 表明是女性
     */
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age=" + age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
