package com.bytedance.java.mytest;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 1:17
 * @Description
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Person person = new Person();
        System.out.println(person.age);
        System.out.println(worker.age);
    }
}

class Person{
    String name;
    static int age = 10;
}

class Worker extends Person{

}