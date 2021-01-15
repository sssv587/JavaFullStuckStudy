package com.bytedance.java.java_senior_study.day02.java1;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2021/1/14 - 23:06
 * @Description 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
    public static void main(String[] args) {
        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();
        System.out.println(b1==b2);
    }
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一：效率稍差
//        synchronized (Bank.class){
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }

        //方式二：效率更高
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
