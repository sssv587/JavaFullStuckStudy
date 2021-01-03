package com.bytedance.java.java_base_study.day13.java1;

import java.util.Objects;

/**
 * @author yuhang.sun
 * @date 2021/1/3 - 14:39
 * @Description
 */

public class Customer {
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //自动生成的equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //手动实现equals的重写
    //重写的原则：比较两个对象的实体内容(即：name，age)是否相同
//    @Override
//    public boolean equals(Object obj) {
//        System.out.println("自定义的equals方法执行了!");
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Customer) {
//            Customer cust = (Customer) obj;
//            //比较两个对象的每个属性是否都相同
////            if (this.age == cust.age && this.name.equals(cust.name)) {
////                return true;
////            } else {
////                return false;
////            }
//
//            //或
//            return this.age == cust.age && this.name.equals(cust.name);
//        }
//        return false;
//    }


    //手动实现
//    @Override
//    public String toString() {
//        return "Customer[name=" + name + ",age=" + age + "]";
//    }

    //自动实现
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
