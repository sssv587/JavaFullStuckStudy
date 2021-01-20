package com.bytedance.java.mytest;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 1:17
 * @Description
 */
public class ExtendsTest {
    public static void main(String[] args) {
        JavaSE worker = new Worker();
        Person person = new Person();
        System.out.println(person.age);
        //System.out.println(worker.age);
        //worker.walk();
        worker.sayHello();
//        new AA(){
//            @Override
//            public void show() {
//                System.out.println("hello");
//            }
//        }.show();
        AA.show();
    }
}

class Person{
    String name;
    static int age = 10;

    public static void walk(){
        System.out.println("sasda");
    }
}

class Worker extends Person implements JavaSE{

    @Override
    public void getSum() {
        System.out.println("好帅啊~~~");
    }
}

interface JavaSE{
    void getSum();

    default void sayHello(){
        System.out.println("hello");
    }
}

abstract class AA{
    class BB{

    }

    public static void show(){
        System.out.println("sss");
    }
    class CC extends BB{

    }
}