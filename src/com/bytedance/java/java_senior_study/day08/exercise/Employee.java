package com.bytedance.java.java_senior_study.day08.exercise;

import org.jetbrains.annotations.NotNull;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/21 - 22:29
 * @Description 定义一个 Employee 类。
 * 该类包含：private 成员变量 name,age,birthday，其中 birthday 为
 * MyDate 类的对象；
 * 并为每一个属性定义 getter, setter 方法；
 * 并重写 toString 方法输出 name, age, birthday
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //按name排序
    @Override
    public int compareTo(@NotNull Employee o) {
        return this.name.compareTo(o.name);
    }
}