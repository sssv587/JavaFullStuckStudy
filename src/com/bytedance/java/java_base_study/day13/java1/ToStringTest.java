package com.bytedance.java.java_base_study.day13.java1;

import java.util.Date;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 16:53
 * @Description Object类中toString()的使用:
 * <p>
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()方法
 * <p>
 * 2.Object类中toString()的定义：
 * public String toString() {
 * return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * }
 * <p>
 * 3.像String、Date、File、包装类等都重写了Object类中的toString()方法。
 * 使得在调用对象的toString()时，返回"实体内容"信息
 * <p>
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的实体内容
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString());//com.bytedance.java.java_base_study.day13.java1.Customer@27e0e4 ---> Customer[name=Tom,age=21]
        System.out.println(cust1);//com.bytedance.java.java_base_study.day13.java1.Customer@27e0e4 ---> Customer[name=Tom,age=21]

        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(445646464646L);
        System.out.println(date.toString());//Wed Feb 15 06:41:04 GMT+08:00 1984
    }
}
