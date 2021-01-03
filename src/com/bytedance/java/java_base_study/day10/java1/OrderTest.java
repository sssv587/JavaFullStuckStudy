package com.bytedance.java.java_base_study.day10.java1;

import com.bytedance.java.java_base_study.day10.java.Order;

/**
 * @author yuhang.sun
 * @date 2020/12/29 - 22:07
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //出了Order类所属得包之后，私有的、缺省得结构就不可以调用了
        //order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
        //order.orderPrivate = 3;

        //出了Order类所属得包之后，私有的、缺省得结构就不可以调用了
        //order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }
}
