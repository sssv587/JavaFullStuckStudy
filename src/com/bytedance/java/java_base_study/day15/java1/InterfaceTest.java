package com.bytedance.java.java_base_study.day15.java1;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 21:51
 * @Description 接口的使用
 * <p>
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 * 3.1 JDK7及以前：只能定义全局常量和抽象方法
 * > 全局常量：public static final的，但是书写时可以省略不写
 * > 抽象方法：public abstract
 * <p>
 * 3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法(略)
 * <p>
 * 4.接口中是不能定义构造器的！意味着接口不可以实例化。
 * <p>
 * 5.Java开发中，接口通过让类去实现(implements)的方式来使用。
 *  如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化。
 *  如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类。
 * <p>
 * 6.Java类可以实现多个接口 ----> 弥补了Java单继承性的局限性
 *  格式：class AA extends BB implements CC,DD,EE{}
 * <p>
 * 7.接口与接口之间可以继承，而且可以多继承
 * <p>
 * 8.接口的具体使用：体现多态性
 * 9.接口，实际上可以看做是一种规范
 * <p>
 * 面试题：抽象类与接口有哪些异同？
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
}

interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    public abstract void fly();

    void stop();//省略了public abstract

    //public Flyable(){}
}

interface Attackable {
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable {
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable, Attackable, CC {

    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}

interface AA {
    void method1();
}

interface BB {
    void method2();
}

interface CC extends AA, BB {

}