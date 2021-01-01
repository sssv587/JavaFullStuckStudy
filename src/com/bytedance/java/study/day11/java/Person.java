package com.bytedance.java.study.day11.java;

/**
 * @author yuhang.sun
 * @date 2021/1/1 - 21:35
 * @Description
 */
public class Person extends Creature {
    String name;
    private int age;

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


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
        sleep();
    }

    private void sleep() {
        System.out.println("睡觉");
    }
}
