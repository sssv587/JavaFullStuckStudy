package com.bytedance.java.java_base_study.day15.java;

/**
 * @author yuhang.sun
 * @date 2021/1/6 - 1:01
 * @Description
 */
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.instance;
        Bank bank2 = Bank.instance;
        System.out.println(bank1);
        //Bank.instance = null;
        System.out.println(bank1 == bank2);
    }
}

class Bank {
    private Bank() {
    }

    public static final Bank instance = new Bank();
}