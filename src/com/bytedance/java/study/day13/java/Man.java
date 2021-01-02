package com.bytedance.java.study.day13.java;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 20:53
 * @Description
 */
public class Man extends Person {
    boolean isSmoking;
    int id = 1002;

    @Override
    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("霸气走路");
    }

    public void earnMoney() {
        System.out.println("男人负责赚钱养家");
    }
}
