package com.bytedance.java.java_base_study.day15.java;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 0:18
 * @Description 抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象
        Worker worker = new Worker();
        method1(worker);//非匿名的类，非匿名的对象
        method1(new Worker());//非匿名的类，匿名的对象
        //创建了一匿名子类的对象：p
        Person p = new Person(){

            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸");
            }
        };

        method1(p);

        //创建匿名子类的匿名对象
        method1(new Person(){

            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸新鲜空气");
            }
        });
    }

    public static void method1(Person p) {
        p.eat();
        p.breath();
    }

    public static void method(Student s) {
    }
}

class Worker extends Person {

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}