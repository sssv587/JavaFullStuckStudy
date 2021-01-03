package com.bytedance.java.java_base_study.day12.java3;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:48
 * @Description
 */
public class Person {
    String name;
    int age;
    int id = 1001;//身份证号

    public Person() {
        System.out.println("我无处不在!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("人:吃饭");
    }

    public void walk() {
        System.out.println("人:走路");
    }
}
