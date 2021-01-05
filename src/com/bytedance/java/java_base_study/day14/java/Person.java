package com.bytedance.java.java_base_study.day14.java;


import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:53
 * @Description
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }

    private void sleep() {
        System.out.println("睡觉");
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Person) {
//            Person c = (Person) obj;
//            return this.age == c.age && this.name.equals(c.name);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Person中的equals方法---->");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
