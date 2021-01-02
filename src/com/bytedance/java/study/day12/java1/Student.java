package com.bytedance.java.study.day12.java1;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 16:08
 * @Description
 */
public class Student extends Person {
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习,专业是:" + major);
    }

    //对父类中的eat()方法进行重写
    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    //@Override
    public void show() {
        System.out.println("我是一个人");
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public void walk(int distance) {
        System.out.println("重写的方法");
    }

    //@Override
    //public int info1() {
    //    return 1;
    //}
}
