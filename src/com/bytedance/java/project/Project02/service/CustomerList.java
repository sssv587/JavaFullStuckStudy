package com.bytedance.java.project.Project02.service;

import com.bytedance.java.project.Project02.bean.Customer;

/**
 * @author yuhang.sun
 * @date 2021/1/1 - 15:09
 * @Description CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    int total = 0;//记录已保存客户对象的数量

    /**
     * 用途：构造器，用来初始化customers数组
     * 参数：totalCustomer：指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    /**
     * @param customer
     * @return 添加成功返回true；false表示数组已满，无法添加
     * @Description 将指定的客户添加到数组中
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        //customers[total] = customer;
        //total++;
        //或
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index
     * @param cust
     * @return true：修改成功 false：修改失败
     * @Description 修改指定索引位置的客户信息
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @param index
     * @return true:删除成功 false:删除失败
     * @Description 删除指定位置上的客户
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        //最后有数据的元素需要置空
        //customers[total - 1] = null;
        //total--;
        //或
        customers[--total] = null;
        return false;
    }

    /**
     * @return
     * @Description 获取所有的客户信息
     */
    public Customer[] getAllCustomers() {
        //return customers;
        Customer[] cust = new Customer[total];
        for (int i = 0; i < cust.length; i++) {
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * @param index
     * @return 如果找到了元素，则返回；如果没有找到，则返回null
     * @Description 获取指定索引位置上的客户
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * @return
     * @Description 获取存储的客户的数量
     */
    public int getTotal() {
        return total;
    }
}
