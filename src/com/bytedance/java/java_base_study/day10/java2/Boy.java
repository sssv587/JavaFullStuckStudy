package com.bytedance.java.java_base_study.day10.java2;

/**
 * @author yuhang.sun
 * @date 2020/12/30 - 0:35
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("你可以去合法登记结婚了！");
        } else {
            System.out.println("先多谈谈恋爱~~~");
        }
    }
}
