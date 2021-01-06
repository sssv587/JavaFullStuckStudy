package com.bytedance.java.java_base_study.day15.exercise2;


/**
 * @author yuhang.sun
 * @date 2021/1/7 - 0:54
 * @Description 定义一个Employee类，该类包含：
 * private成员变量name,number,birthday，其中birthday 为MyDate类的对象；
 * abstract方法earnings()；toString()方法输出对象的name,number和birthday。
 */
abstract public class Employee {
    private String name;
    private double number;
    private MyDate birthday;

    public Employee(String name, double number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", number=" + number +
                        ", birthday=" + birthday.toDateString();
    }
}

