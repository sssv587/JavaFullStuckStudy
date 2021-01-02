package com.bytedance.java.study.day13.java;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:55
 * @Description
 */
public class Women extends Person {
    boolean isBeauty;

    public void goShopping() {
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat() {
        System.out.println("女人少吃，为了减肥");
    }

    @Override
    public void walk() {
        System.out.println("女人窈窕的走路");
    }
}
