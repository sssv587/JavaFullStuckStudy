package com.bytedance.java.java_base_study.day11.java;

/**
 * @author yuhang.sun
 * @date 2021/1/1 - 21:36
 * @Description
 */
public class Student extends Person {
    //String name;
    //int age;
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        setAge(age);
        this.major = major;
    }

    //public void eat(){
    //   System.out.println("吃饭");
    //

    //public void sleep(){
    //   System.out.println("睡觉");
    //

    public void study() {
        System.out.println("学习");
    }

    public void show() {
        System.out.println("name:" + getName() + " age:" + getAge());
    }
}
