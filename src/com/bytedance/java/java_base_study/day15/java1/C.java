package com.bytedance.java.java_base_study.day15.java1;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 23:58
 * @Description
 */

public class C extends B implements A {
    public static void main(String[] args) {
        new C().pX();
    }

    public void pX() {
        //编译不通过。因为x是不明确的
        //System.out.println(x);
        //System.out.println(super.x);//1
        //System.out.println(A.x);//0
        System.out.println(x1);
        System.out.println(x2);
    }
}

interface A {
    int x1 = 0;
}

class B {
    int x2 = 1;
}