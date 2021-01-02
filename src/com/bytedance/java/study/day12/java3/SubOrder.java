package com.bytedance.java.study.day12.java3;

import com.bytedance.java.study.day12.java2.Order;

/**
 * @author yuhang.sun
 * @date 2021/1/2 - 17:37
 * @Description
 */
public class SubOrder extends Order {
    public void method() {
        orderProtected = 1;
        orderPublic = 2;
        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的结构
        //order.orderProtected = 3;
        //order.orderPrivate = 4;

        //order.methodProtected();
        //order.methodPrivate();
    }
}
