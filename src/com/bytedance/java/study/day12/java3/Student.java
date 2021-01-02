package com.bytedance.java.study.day12.java3;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:48
 * @Description
 */
public class Student extends Person {
    String major;
    int id = 1002;//学号

    public Student() {
    }

    public Student(String major) {
        //默认调用super()
        super();
        this.major = major;
    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生:多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生:学习知识");
        this.eat();
        super.eat();
        super.walk();
    }

    public void show() {
        System.out.println("name=" + this.name + ", age=" + super.age);
        System.out.println("id=" + this.id);
        System.out.println("id=" + super.id);
    }
}