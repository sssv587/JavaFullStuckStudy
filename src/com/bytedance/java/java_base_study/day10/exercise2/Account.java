package com.bytedance.java.java_base_study.day10.exercise2;

/**
 * @author yuhang.sun
 * @date 2020/12/30 - 22:56
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存钱
    public void deposit(double amt) {
        balance += amt;
        System.out.println("存钱成功");
    }

    //取钱
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("取钱成功");
            return;
        }
        System.out.println("余额不足");
    }


}
