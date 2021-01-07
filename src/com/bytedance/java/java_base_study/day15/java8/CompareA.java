package com.bytedance.java.java_base_study.day15.java8;

/**
 * @author yuhang.sun
 * @date 2021/1/8 - 0:37
 * @Description JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 */
public interface CompareA {
    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }

    default void method3(){
        System.out.println("CompareA:上海");
    }
}
