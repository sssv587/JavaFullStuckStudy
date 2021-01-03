package com.bytedance.java.java_base_study.day12.java3;

import com.bytedance.java.java_base_study.day12.java2.Order;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:40
 * @Description
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类(非子类)要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
        //order.orderDefault = 2;
        //order.orderProtected = 3;
        //order.orderPrivate = 4;

        //order.methodDefault();
        //order.methodProtected();
        //order.methodPrivate();
    }

    public void show(Order order) {
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类(非子类)要使用Order类，不可以调用声明为private、缺省、protected权限的属性、方法
        //order.orderDefault = 2;
        //order.orderProtected = 3;
        //order.orderPrivate = 4;

        //order.methodDefault();
        //order.methodProtected();
        //order.methodPrivate();
    }
}
