package com.bytedance.java.java_base_study.day12.java4;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:53
 * @Description
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }

    private void sleep(){
        System.out.println("睡觉");
    }
}
