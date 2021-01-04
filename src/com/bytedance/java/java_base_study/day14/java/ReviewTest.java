package com.bytedance.java.java_base_study.day14.java;

import org.junit.Test;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 22:57
 * @Description
 */
public class ReviewTest {
    //关于toString()方法
    @Test
    public void test3() {
        String s = "abc";
        s = null;
        System.out.println(s);
        //System.out.println(s.toString());//NullPointerException
    }

    //手动写的和自动生成的equals()
    @Test
    public void test2() {
        Person p = new Person("Tom", 12);
        Man m = new Man("Tom", 12);
        System.out.println(p.equals(m));
        System.out.println(m.equals(p));
    }

    //数组也作为object类的子类出现，可以调用object类中定义的方法
    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3};
        print(arr.getClass());
        print(arr.getClass().getSuperclass());
    }

    public void print(Object obj) {
        System.out.println(obj);
    }
}
