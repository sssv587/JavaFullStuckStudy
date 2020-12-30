package com.bytedance.java.study.day10.exercise2;

/**
 * @author yuhang.sun
 * @date 2020/12/30 - 22:57
 */
public class Bank {
    private Customer[] customers;//存放多个客户的数组
    private int numberOfCustomers;//记录客户的个数

    public Bank(Customer[] customers) {
        this.customers = customers;
    }

    public Bank(){
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers] = customer;
            numberOfCustomers++;
        }
    }

    //获取客户的个数
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index) {
        //return customers[index];//可能报异常
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}
