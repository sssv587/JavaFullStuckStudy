package com.bytedance.java.java_senior_study.day06.java1;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/20 - 23:25
 * @Description
 */
public class User implements Comparable {
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals()...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() { //return name.hashCode() + age;
        return Objects.hash(name, age);
    }

    //按照姓名从小到大排列，按照年龄从小到大
    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof User) {
            User user = (User) o;
            //return -this.name.compareTo(((User) o).name);
            int compare = -this.name.compareTo(((User) o).name);
            if (compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.age, user.age);
            }
        } else {
            throw new RuntimeException("输入的类型有误");
        }
    }
}
