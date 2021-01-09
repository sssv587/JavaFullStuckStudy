package com.bytedance.java.java_base_study.day15.java2;

import org.jetbrains.annotations.NotNull;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 14:45
 * @Description
 */
public class InnerClassTest1 {
    public static void main(String[] args) {

    }

    //开发中很少见
    public void method() {
        //局部内部类
        class AA {

        }
    }

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable() {
        //创建一个实现了Comparable接口的类:局部内部类
        //方式一：
//        class MyComparable implements Comparable {
//
//            @Override
//            public int compareTo(@NotNull Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二：
        return new Comparable() {
            @Override
            public int compareTo(@NotNull Object o) {
                return 0;
            }
        };
    }
}
