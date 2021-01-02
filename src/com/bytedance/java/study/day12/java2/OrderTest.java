package com.bytedance.java.study.day12.java2;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:34
 * @Description
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其他类，不可以调用Order类中私有的属性、方法
        //order.orderPrivate = 4;
        //order.methodPrivate();
    }
}
