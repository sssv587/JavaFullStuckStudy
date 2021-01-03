package com.bytedance.java.java_base_study.day12.java1;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 16:08
 * @Description
 */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk(int distance) {
        System.out.println("走路,走的距离是:" + distance + "公里");
        show();
    }

    private void show() {
        System.out.println("我是一个人");
    }

    public Object info() {
        return null;
    }

    public double info1() {
        return 0.1;
    }
}
