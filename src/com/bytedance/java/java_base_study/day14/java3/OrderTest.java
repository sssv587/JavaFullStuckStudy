package com.bytedance.java.java_base_study.day14.java3;

/**
 * @author yuhang.sun
 * @date 2021/1/5 - 22:52
 * @Description  对属性可以赋值的位置：
 * ① 默认初始化
 * ② 显式初始化 / ③ 在代码块中进行赋值
 * ④ 构造器中初始化
 * ⑤ 有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
 *
 * 执行顺序：① - ②/③ - ④ - ⑤
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{

    {
        orderId = 4;
    }
    int orderId = 3;
}