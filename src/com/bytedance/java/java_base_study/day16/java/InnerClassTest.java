package com.bytedance.java.java_base_study.day16.java;

/**
 * @author yuhang.sun
 * @date 2021/1/9 - 16:25
 * @Description
 */
public class InnerClassTest {
    public void onCreate() {

    }

    /**
     * 在局部内部类的方法中(比如：show)如果调用局部内部类所声明的方法(比如:method)中的局部变量(比如：number)的话，
     * 要求此局部变量声明为final的。
     * <p>
     * jdk7及之前版本:要求此局部变量显式的声明为final的
     * jdk8及之后的版本：可以省略final的声明
     */
    public void method() {
        //局部变量(省略了final)
        int number = 10;

        class AA {
            public void show() {
                //number = 20;
                System.out.println(number);
            }
        }
    }
}
