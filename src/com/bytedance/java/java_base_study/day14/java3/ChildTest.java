package com.bytedance.java.java_base_study.day14.java3;

/**
 * @author yuhang.sun
 * @date 2021/1/5 - 23:01
 * @Description 自己测试先执行代码块还是构造方法
 *  1、初始化父类静态属性
 *  2、执行父类静态代码块
 *  3、初始化子类静态属性
 *  4、执行子类静态代码块
 *  5、初始化父类实例变量
 *  6、执行父类动态代码块
 *  7、执行父类构造方法
 *  8、初始化子类实例变量
 *  9、执行子类动态代码块
 * 10、执行子类构造方法
 */
public class ChildTest {
    public static void main(String[] args) {
        Child child = new Child("小夕");
    }
}

class Child {
    static {
        System.out.println("我是静态代码块!");
    }

    {
        name = "sss";
        System.out.println(this.name);
        System.out.println("我是非静态代码块!");
    }

    private String name = "sss";

    public Child(String name) {
        System.out.println(this.name);
        this.name = name;
        System.out.println(this.name);
        System.out.println("我是构造方法!");
    }
}