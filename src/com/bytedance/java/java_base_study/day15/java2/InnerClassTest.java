package com.bytedance.java.java_base_study.day15.java2;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 1:22
 * @Description 类的内部成员之五：内部类
 * <p>
 * 1.Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 * <p>
 * 2.内部类的分类：成员内部类(静态、非静态) vs 局部内部类(方法内、代码块内、构造器内)
 * <p>
 * 3.成员内部类：
 * 一方面，作为外部类的成员：
 * > 调用外部类的成员
 * > 可以被static修饰
 * > 可以被四种不同的权限修饰
 * <p>
 * 另一方面，作为一个类：
 * > 类内可以定义属性、方法、构造器等
 * > 可以被final修饰，表示此类不能被继承。言外之意final，就可以被继承
 * > 可以被abstract修饰
 */
public class InnerClassTest {
    public static void main(String[] args) {

    }
}


class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭!");
    }

    //静态成员内部类
    static class Dog {
        String name;
        int age;

        //eat();

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Dog() {
        }

        public void show() {
            System.out.println("卡拉是条狗");
        }
    }

    //非静态成员内部类
    class Bird {
        String name;

        public Bird() {
        }

        public void sing() {
            System.out.println("我是一只小小鸟");
            Person.this.eat();//调用外部类的非静态属性
        }
    }

    public void method() {
        //局部内部类
        class AA {

        }
    }
}