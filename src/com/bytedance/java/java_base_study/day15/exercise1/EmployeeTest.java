package com.bytedance.java.java_base_study.day15.exercise1;

/**
 * @author yuhang.sun
 * @date 2021/1/7 - 0:11
 * @Description 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager("库克",1001,5000,50000);
        manager.work();
        System.out.println(manager.getId());

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
        System.out.println(commonEmployee.getSalary());
    }
}
