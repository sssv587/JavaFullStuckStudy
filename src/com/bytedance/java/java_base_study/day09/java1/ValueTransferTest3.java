package com.bytedance.java.java_base_study.day09.java1;

/**
 * @author yuhang.sun
 * @date 2020/12/27 - 23:58
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();
        test.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        System.out.println(v);
        second(v, i);
        System.out.println(v);
        System.out.println(v.i);
    }

    public void second(Value ves, int i) {
        i = 0;
        ves.i = 20;
        System.out.println(ves);
        Value val = new Value();
        ves = val;
        System.out.println(ves + " " + val);
        System.out.println(ves.i + " " + i);
    }
}

class Value {
    int i = 15;
}
